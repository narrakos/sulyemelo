package com.backend.service;

import com.backend.entity.Competition;
import com.backend.repository.CompetitionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class CompetitionService extends AbstractService<Competition>{

    private final CompetitionRepository repository;

    @Autowired
    public CompetitionService(CompetitionRepository repository) {
        this.repository = repository;
    }

    @Override
    JpaRepository<Competition, Long> getRepository() {
        return repository;
    }
}
