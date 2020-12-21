package com.backend.service;

import com.backend.entity.Gallery;
import com.backend.repository.GalleryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class GalleryService extends AbstractService<Gallery>{

    private final GalleryRepository repository;

    @Autowired
    public GalleryService(GalleryRepository repository) {
        this.repository = repository;
    }

    @Override
    JpaRepository<Gallery, Long> getRepository() {
        return repository;
    }
}
