package com.backend.service;

import com.backend.entity.AbstractEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public abstract class AbstractService<Entity extends AbstractEntity, Repository extends JpaRepository<Entity, Long>> {

    Entity entity;
    Repository repository;

    public Entity save(Entity entity){
        return repository.save(entity);
    }
}
