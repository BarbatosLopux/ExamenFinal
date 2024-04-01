package com.example.GestionAudioVisal.web.controller;


import com.example.GestionAudioVisal.domain.service.GenderService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Gender")
@Tag(name="Gender resources")
public class GenderController {

@Autowired
GenderService genderService;


}
