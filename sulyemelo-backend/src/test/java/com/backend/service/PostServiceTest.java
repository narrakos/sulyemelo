package com.backend.service;

import com.backend.entity.Post;
import com.backend.repository.PostRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class PostServiceTest {
    @Autowired
    private PostService postService;

    @Test
    void postSave() {
        Post post = new Post();
        post.setTitle("neptunnn");
        final PostRepository postRepository = (PostRepository) postService.getRepository();
        assertEquals(post, postRepository.save(post));
    }
}