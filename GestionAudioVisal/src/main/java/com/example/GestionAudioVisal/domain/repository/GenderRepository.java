package com.example.GestionAudioVisal.domain.repository;

import com.example.GestionAudioVisal.persistence.entity.Gender;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenderRepository extends JpaRepository<Gender, Integer> {

}
