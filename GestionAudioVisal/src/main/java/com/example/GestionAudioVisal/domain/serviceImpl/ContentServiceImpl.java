package com.example.GestionAudioVisal.domain.serviceImpl;

import com.example.GestionAudioVisal.domain.repository.ContentRepository;
import com.example.GestionAudioVisal.domain.service.ContentService;
import com.example.GestionAudioVisal.persistence.entity.Content;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContentServiceImpl implements ContentService {

 @Autowired
 ContentRepository repository;

 @Override
 public List<Content> findAll(){return repository.findAll();}


}
