package com.backend.controller;

import com.backend.entity.Post;
import com.backend.entity.Profile;
import com.backend.service.PostService;
import org.hibernate.type.descriptor.sql.VarcharTypeDescriptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@CrossOrigin("*")
@RequestMapping("post")
public class PostController {

    private final PostService postService;

    @Autowired
    public PostController(PostService postService){
        this.postService = postService;
    }

    @PostMapping("save")
    public void savePost(@RequestParam Profile profile,
                         @RequestParam String title,
                         @RequestParam VarcharTypeDescriptor body,
                         @RequestParam LocalDateTime dateOfCreation){
        Post post = new Post();
        post.setBody(body);
        post.setProfile(profile);
        post.setDateOfCreation(dateOfCreation);
        post.setTitle(title);

        postService.save(post);
    }


}
