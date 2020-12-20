package com.backend.repository;

import com.backend.entity.NewsletterEmail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsletterEmailRepository extends JpaRepository<NewsletterEmail, Long> {
}
