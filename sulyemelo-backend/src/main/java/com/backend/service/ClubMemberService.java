package com.backend.service;

import com.backend.entity.ClubMember;
import com.backend.repository.ClubMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ClubMemberService extends AbstractService<ClubMember>{

    private final ClubMemberRepository repository;

    @Autowired
    public ClubMemberService(ClubMemberRepository repository) {
        this.repository = repository;
    }

    @Override
    JpaRepository<ClubMember, Long> getRepository() {
        return repository;
    }
}
