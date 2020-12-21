package com.backend.entity;

import javax.persistence.*;

@Entity
@Table(name = "Gallery")
public class Gallery extends AbstractEntity{

    @Column(name = "name")
    private String name;

    @Column(name = "path")
    private String path;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}

