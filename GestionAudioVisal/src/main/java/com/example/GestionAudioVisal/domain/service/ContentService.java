package com.example.GestionAudioVisal.domain.service;

import com.example.GestionAudioVisal.persistence.entity.Content;

import java.util.List;

public interface ContentService {

    List<Content> findAll();

}
