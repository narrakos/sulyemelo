package com.backend.service;

import com.backend.entity.NewsletterEmail;
import com.backend.repository.NewsletterEmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class NewsletterService extends AbstractService<NewsletterEmail>{

    private final NewsletterEmailRepository repository;

    @Autowired
    public NewsletterService(NewsletterEmailRepository repository) {
        this.repository = repository;
    }

    @Override
    JpaRepository<NewsletterEmail, Long> getRepository() {
        return repository;
    }
}
