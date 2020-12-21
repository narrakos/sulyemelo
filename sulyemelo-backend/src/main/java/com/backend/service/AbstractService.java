package com.backend.service;

import com.backend.entity.AbstractEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class AbstractService<Entity extends AbstractEntity> {

    Entity entity;
    JpaRepository<Entity, Long> repository;

    public Entity save(Entity entity){
        return getRepository().save(entity);
    }

    public List<Entity> saveAll(List<Entity> entities) {
        return getRepository().saveAll(entities);
    }

    public List<Entity> findAll() {
        return getRepository().findAll();
    }

    public List<Entity> findAll(Sort sort) {
        return getRepository().findAll(sort);
    }

    public List<Entity> findAllById(Iterable<Long> ids) {
        return getRepository().findAllById(ids);
    }

    public void flush() {

        getRepository().flush();
    }

    public Entity saveAndFlush(Entity entity) {
        return getRepository().saveAndFlush(entity);
    }

    public void deleteInBatch(Iterable<Entity> entities) {

        getRepository().deleteInBatch(entities);
    }

    public void deleteAllInBatch() {

        getRepository().deleteAllInBatch();
    }

    public Entity getOne(Long id) {
        return getRepository().getOne(id);
    }

    abstract JpaRepository<Entity, Long> getRepository();
}
