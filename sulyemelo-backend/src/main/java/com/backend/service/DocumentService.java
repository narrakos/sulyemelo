package com.backend.service;

import com.backend.entity.Document;
import com.backend.repository.DocumentRepository;
import org.springframework.stereotype.Service;

@Service
public class DocumentService extends AbstractService<Document, DocumentRepository>{
}
