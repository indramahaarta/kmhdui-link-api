package com.code.kmhduilinkapi.api.repository;

import com.code.kmhduilinkapi.api.model.Link;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ApiRepository extends JpaRepository<Link, Long> {
    Optional<Link> findByCustomLink(String customLink);
}
