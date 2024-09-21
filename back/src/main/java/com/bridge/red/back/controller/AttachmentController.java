package com.bridge.red.back.controller;

import com.bridge.red.back.model.Attachment;
import com.bridge.red.back.service.AttachmentService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/attachments")
public class AttachmentController {
    private final AttachmentService attachmentService;


    @PostMapping(value = "/add", produces = "application/json")
    public ResponseEntity<Map<String, String>> uploadAttachment(
            @RequestPart(value = "file") MultipartFile file)
            throws IOException {
        Attachment attachment = attachmentService.addAttachment(file);
        Map<String, String> attachmentStatus = new HashMap<>();
        attachmentStatus.put("status", "ok");
        attachmentStatus.put("attachId", attachment.getId().toString());
        return ResponseEntity.ok(attachmentStatus);
    }

    @GetMapping("/get/{filename:.+}")
    public ResponseEntity<Resource> serveFile(
            @PathVariable String filename, HttpServletRequest request)
            throws IOException {
        Resource resource = attachmentService.loadFileAsResource(filename);
        String contentType;
        contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
        if (contentType == null) {
            contentType = "application/octet-stream";
        }
        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(contentType))
                .header(
                        HttpHeaders.CONTENT_DISPOSITION,
                        "attachment; filename=\"" + resource.getFilename() + "\"")
                .body(resource);
    }
}
