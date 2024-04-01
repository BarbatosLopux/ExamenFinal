package com.example.GestionAudioVisal.domain.service;

import com.example.GestionAudioVisal.persistence.entity.Gender;
import com.example.GestionAudioVisal.persistence.entity.User;

import java.util.List;

public interface GenderService {

    List<Gender> findAll();
    Gender findById(Integer id);
    Gender save(Gender gender);
    Gender update(Integer id, Gender genderDetails);
    void delete(Integer id);
}
