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

    <S extends Entity> List<S> saveAll(Iterable<S> entities) {
        return repository.saveAll(entities);
    }

    void flush() {

    }

    <S extends Entity> S saveAndFlush(S entity) {
        return repository.saveAndFlush(entity);
    }

    void deleteInBatch(Iterable<Entity> entities) {

    }

    void deleteAllInBatch() {

    }

    Entity getOne(Long id) {
        return repository.getOne(id);
    }

    <S extends Entity> List<S> findAll(Example<S> example) {
        return repository.findAll(example);
    }

    <S extends Entity> List<S> findAll(Example<S> example, Sort sort) {
        return repository.findAll(example, sort);
    }

}
