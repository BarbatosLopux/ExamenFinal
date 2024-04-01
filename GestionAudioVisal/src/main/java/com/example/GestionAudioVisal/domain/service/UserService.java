package com.example.GestionAudioVisal.domain.service;

import com.example.GestionAudioVisal.persistence.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findById(int id);

    User save(User user);
    User update(User user);
    void delete(int id);


}
