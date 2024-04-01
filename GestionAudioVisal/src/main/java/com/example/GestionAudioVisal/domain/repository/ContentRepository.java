package com.example.GestionAudioVisal.domain.repository;

import com.example.GestionAudioVisal.persistence.entity.Content;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentRepository extends JpaRepository<Content, Integer > {

}
