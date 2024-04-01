package com.example.GestionAudioVisal.domain.repository;

import com.example.GestionAudioVisal.persistence.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {


}
