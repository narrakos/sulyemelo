package com.backend.controller;


import com.backend.entity.NewsletterEmail;
import com.backend.service.NewsletterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("newsletter")
public class NewsletterEmailController {

    public final NewsletterService newsletterService;

    @Autowired
    public NewsletterEmailController(NewsletterService newsletterService){
        this.newsletterService = newsletterService;
    }

    @PostMapping("save")
    public void SaveNewsletterEmail(@RequestParam String email){
        NewsletterEmail newsletterEmail = new NewsletterEmail();
        newsletterEmail.setEmail(email);
        newsletterService.save(newsletterEmail);
    }

}
