package com.backend.entity;

import javax.persistence.*;

@Entity
@Table(name = "NewsletterEmail")
public class NewsletterEmail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "newsletter_email_id")
    private Long id;

    @Column(name = "email")
    private String email;

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
