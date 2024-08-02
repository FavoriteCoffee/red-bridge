package com.bridge.red.back.service;

import com.bridge.red.back.model.Attachment;
import com.bridge.red.back.repo.AttachmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;

@Service
@RequiredArgsConstructor
public class AttachmentService {
    private final AttachmentRepository attachmentRepository;


    public Attachment addAttachment(MultipartFile file) throws IOException {
        File uploadDir = new File(System.getProperty("upload.path"));
        // Если директория uploads не существует, то создаем ее
        if (!uploadDir.exists()) {
            uploadDir.mkdirs();
        }
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        Date date = cal.getTime();
        String curDate = date.toString();
        String fileName =
                "attach_" + curDate + "_" + file.getOriginalFilename().toLowerCase().replaceAll(" ", "-");
        file.transferTo(new File(uploadDir + "/" + fileName));
        Attachment attachment = Attachment.builder()
                .attachTitle(fileName)
                .uploadDate(date)
                .extension(file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".") + 1))
                .downloadLink("/attachments/get/" + Year.now() + "/" + fileName)
                .build();
        attachmentRepository.save(attachment);
        return attachment;
    }


    public Attachment findAttachById(Long attachId) throws Exception {
        return attachmentRepository
                .findById(attachId)
                .orElseThrow(() -> new Exception("Attachment not found!"));
    }


    public Resource loadFileAsResource( String fileName)
            throws MalformedURLException {
        Path fileStorageLocation =
                Paths.get(System.getProperty("upload.path")).toAbsolutePath().normalize();
        Path filePath = fileStorageLocation.resolve(fileName).normalize();
        return new UrlResource(filePath.toUri());
    }

}
