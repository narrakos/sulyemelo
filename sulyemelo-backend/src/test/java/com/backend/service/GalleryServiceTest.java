package com.backend.service;

import com.backend.entity.Gallery;
import com.backend.repository.GalleryRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class GalleryServiceTest {
    @Autowired
    private GalleryService galleryService;

    @Test
    void gallerySave() {
        Gallery gallery = new Gallery();
        gallery.setName("Neptuuun");
        final GalleryRepository galleryRepository = (GalleryRepository) galleryService.getRepository();
        assertEquals(gallery, galleryRepository.save(gallery));
    }
}