package com.backend.entity;

import javax.persistence.*;

@Entity
@Table(name = "Gallery")
public class Gallery extends AbstractEntity{

    @Column(name = "name")
    private String name;

    @Lob
    @Column(name = "picture")
    private byte[] picture;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }
}

