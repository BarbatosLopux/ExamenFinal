package com.example.GestionAudioVisal.domain.serviceImpl;

import com.example.GestionAudioVisal.domain.repository.UserRepository;
import com.example.GestionAudioVisal.domain.service.UserService;
import com.example.GestionAudioVisal.persistence.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository repository;
    @Override
    public List<User> findAll() {
        return repository.findAll();
    }
}
