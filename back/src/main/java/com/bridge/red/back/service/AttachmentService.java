package com.bridge.red.back.service;

import com.bridge.red.back.model.Attachment;
import com.bridge.red.back.repo.AttachmentRepository;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class AttachmentService {
    private final AttachmentRepository attachmentRepository;
    private final Environment env;


    public Attachment addAttachment(MultipartFile file) throws IOException {
        File uploadDir = new File(Objects.requireNonNull(env.getProperty("upload.path")));
        // Если директория uploads не существует, то создаем ее
        if (!uploadDir.exists()) {
            uploadDir.mkdirs();
        }
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy_MM_dd", Locale.ENGLISH);
        String curDate = dateTimeFormatter.format(ldt);
        String fileName =
                "attach_" + curDate + "_" + file.getOriginalFilename().toLowerCase().replaceAll(" ", "-");
        file.transferTo(Path.of(uploadDir + "/" + fileName));
        Attachment attachment = Attachment.builder()
                .attachTitle(fileName)
                .uploadDate(ldt)
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
                Paths.get(Objects.requireNonNull(env.getProperty("upload.path"))).toAbsolutePath().normalize();
        Path filePath = fileStorageLocation.resolve(fileName).normalize();
        return new UrlResource(filePath.toUri());
    }

}
