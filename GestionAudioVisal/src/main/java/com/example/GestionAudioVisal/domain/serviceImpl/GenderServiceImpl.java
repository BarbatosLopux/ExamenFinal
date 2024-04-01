package com.example.GestionAudioVisal.domain.serviceImpl;

import com.example.GestionAudioVisal.domain.repository.GenderRepository;
import com.example.GestionAudioVisal.domain.service.GenderService;
import com.example.GestionAudioVisal.persistence.entity.Gender;
import com.example.GestionAudioVisal.persistence.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenderServiceImpl implements GenderService {

    @Autowired
    GenderRepository repository;
    @Override
    public List<Gender> findAll() {
        return repository.findAll();
    }
    @Override
    public Gender findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Gender save(Gender gender) {
        return repository.save(gender);
    }

    @Override
    public Gender update(Integer id, Gender genderDetails) {
        Gender gender = repository.findById(id).orElse(null);
        if (gender != null) {
            gender.setNameGender(genderDetails.getNameGender());
            return repository.save(gender);
        }
        return null;
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
