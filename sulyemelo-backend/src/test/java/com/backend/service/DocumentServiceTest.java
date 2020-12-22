package com.backend.service;

import com.backend.entity.Document;
import com.backend.repository.DocumentRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class DocumentServiceTest {
    @Autowired
    private DocumentService documentService;

    @Test
    void documentSave() {
        Document document = new Document();
        document.setTitle("neptun");
        final DocumentRepository documentRepository = (DocumentRepository) documentService.getRepository();
        assertEquals(document, documentRepository.save(document));
    }
}