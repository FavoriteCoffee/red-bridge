package com.bridge.red.back.repo;

import com.bridge.red.back.model.Attachment;
import org.springframework.data.repository.CrudRepository;

public interface AttachmentRepository extends CrudRepository<Attachment, Long> {
}