package com.backend.entity;

import org.hibernate.type.descriptor.sql.VarcharTypeDescriptor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Post")
public class Post extends AbstractEntity{

    @ManyToOne
    @JoinColumn(name = "profile_id" )
    private Profile profile;

    @Column(name = "title")
    private String title;

    @Column(name = "body")
    private VarcharTypeDescriptor body;

    @Column(name = "date_of_creation")
    private LocalDateTime dateOfCreation;

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public VarcharTypeDescriptor getBody() {
        return body;
    }

    public void setBody(VarcharTypeDescriptor body) {
        this.body = body;
    }

    public LocalDateTime getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(LocalDateTime dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }
}
