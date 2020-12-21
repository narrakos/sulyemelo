package com.backend.service;

import com.backend.entity.Event;
import com.backend.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class EventService extends AbstractService<Event>{

    private final EventRepository repository;

    @Autowired
    public EventService(EventRepository repository) {
        this.repository = repository;
    }

    @Override
    JpaRepository<Event, Long> getRepository() {
        return repository;
    }
}
