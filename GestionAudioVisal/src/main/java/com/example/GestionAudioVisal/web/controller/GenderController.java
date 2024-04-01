package com.example.GestionAudioVisal.web.controller;


import com.example.GestionAudioVisal.domain.service.GenderService;
import com.example.GestionAudioVisal.persistence.entity.Gender;
import com.example.GestionAudioVisal.persistence.entity.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Gender")
@Tag(name="Gender resources")
public class GenderController {

@Autowired
GenderService genderService;



    @Operation(summary="Get all genders for the application")
    @GetMapping("/findall")
    @PreAuthorize("hasRole('ADMIN')")
    @SecurityRequirement(name = "bearerAuth")
    public List<Gender> findAll(){
            return genderService.findAll();
        }

    @Operation(summary="Get a specific gender by ID")
    @GetMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    @SecurityRequirement(name = "bearerAuth")
    public Gender findById(@PathVariable Integer id){
        return genderService.findById(id);
    }
    @Operation(summary="Create a new gender")
    @PostMapping("/create")
    @PreAuthorize("hasRole('ADMIN')")
    @SecurityRequirement(name = "bearerAuth")
    public Gender createGender(@RequestBody Gender gender){
        return genderService.save(gender);
    }

    @Operation(summary="Update an existing gender")
    @PutMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    @SecurityRequirement(name = "bearerAuth")
    public Gender updateGender(@PathVariable Integer id, @RequestBody Gender genderDetails){
        return genderService.update(id, genderDetails);
    }

    @Operation(summary="Delete a gender by ID")
    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    @SecurityRequirement(name = "bearerAuth")
    public void deleteGender(@PathVariable Integer id){
        genderService.delete(id);
    }

}
