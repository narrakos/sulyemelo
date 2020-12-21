package com.backend.service;

import com.backend.entity.Document;
import com.backend.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class DocumentService extends AbstractService<Document>{

    private final DocumentRepository repository;

    @Autowired
    public DocumentService(DocumentRepository repository) {
        this.repository = repository;
    }

    @Override
    JpaRepository<Document, Long> getRepository() {
        return repository;
    }
}
