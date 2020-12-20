package com.backend.service;

import com.backend.entity.Post;
import com.backend.repository.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostService extends AbstractService<Post, PostRepository>{
}
