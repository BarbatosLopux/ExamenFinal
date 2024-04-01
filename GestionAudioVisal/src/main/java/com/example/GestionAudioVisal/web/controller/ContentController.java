package com.example.GestionAudioVisal.web.controller;


import com.example.GestionAudioVisal.domain.service.ContentService;
import com.example.GestionAudioVisal.persistence.entity.Content;
import com.example.GestionAudioVisal.persistence.entity.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Content")
@Tag(name="Content resources")
public class ContentController {

@Autowired
ContentService contentService;


@Operation(summary="Get all Contents for the application")
@GetMapping("/findall")
@PreAuthorize("hasRole('ADMIN')")
@SecurityRequirement(name = "bearerAuth")
public List<Content> findAll(){
        return contentService.findAll();
    }



}
