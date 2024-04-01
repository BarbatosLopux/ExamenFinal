package com.example.GestionAudioVisal.domain.service;

import com.example.GestionAudioVisal.persistence.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

}
