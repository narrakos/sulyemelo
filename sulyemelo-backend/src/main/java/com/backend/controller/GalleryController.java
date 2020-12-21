package com.backend.controller;

import com.backend.entity.Competition;
import com.backend.entity.Event;
import com.backend.entity.Gallery;
import com.backend.service.GalleryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@CrossOrigin("*")
@RequestMapping("gallery")
public class GalleryController {

    private final GalleryService galleryService;

    @Autowired
    public GalleryController(GalleryService galleryService) {
        this.galleryService = galleryService;
    }

    @PostMapping("save")
    public void saveGallery(
            @RequestParam String name,
            @RequestParam String path) {

        Gallery toSaveGallery = new Gallery();
        toSaveGallery.setName(name);
        toSaveGallery.setPath(path);

        galleryService.save(toSaveGallery);
    }
}
