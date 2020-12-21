package com.backend.service;

import com.backend.entity.Post;
import com.backend.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class PostService extends AbstractService<Post>{

    private final PostRepository repository;

    @Autowired
    public PostService(PostRepository repository) {
        this.repository = repository;
    }

    @Override
    JpaRepository<Post, Long> getRepository() {
        return repository;
    }
}
