package com.backend.service;

import com.backend.entity.AbstractEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class AbstractService<Entity extends AbstractEntity, Repository extends JpaRepository<Entity, Long>> {

    Entity entity;
    Repository repository;

    public Entity save(Entity entity){
        return repository.save(entity);
    }

    List<Entity> findAll() {
        return repository.findAll();
    }

    List<Entity> findAll(Sort sort) {
        return repository.findAll(sort);
    }

    List<Entity> findAllById(Iterable<Long> ids) {
        return repository.findAllById(ids);
    }

    void flush() {

        repository.flush();
    }

    Entity saveAndFlush(Entity entity) {
        return repository.saveAndFlush(entity);
    }

    void deleteInBatch(Iterable<Entity> entities) {

        repository.deleteInBatch(entities);
    }

    void deleteAllInBatch() {

        repository.deleteAllInBatch();
    }

    Entity getOne(Long id) {
        return repository.getOne(id);
    }

}
