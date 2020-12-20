package com.backend.entity;

import javax.persistence.*;

@Entity
@Table(name = "NewsletterEmail")
public class NewsletterEmail extends AbstractEntity{

    @Column(name = "email")
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
