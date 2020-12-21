package com.backend.controller;

import com.backend.entity.Competition;
import com.backend.entity.Document;
import com.backend.entity.Event;
import com.backend.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@CrossOrigin("*")
@RequestMapping("document")
public class DocumentController {

    private final DocumentService documentService;

    @Autowired
    public DocumentController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @PostMapping("save")
    public void saveDocument(
            @RequestParam String title,
            @RequestParam String content,
            @RequestParam LocalDateTime dateOfCreation) {

        Document toSaveDocument = new Document();
        toSaveDocument.setTitle(title);
        toSaveDocument.setContent(content);
        toSaveDocument.setDateOfCreation(dateOfCreation);

        documentService.save(toSaveDocument);
    }

}
