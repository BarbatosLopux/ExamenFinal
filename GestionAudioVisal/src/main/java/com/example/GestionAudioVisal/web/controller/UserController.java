package com.example.GestionAudioVisal.web.controller;


import com.example.GestionAudioVisal.domain.security.JWTAuthenticationConfig;
import com.example.GestionAudioVisal.domain.service.UserService;
import com.example.GestionAudioVisal.persistence.entity.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@Tag(name="User resources")
public class UserController {

@Autowired
UserService userService;


    @Autowired
    JWTAuthenticationConfig jwtAuthenticationConfig;

    @Operation(summary="Register a user into application given permissions")
    @PostMapping("/login") //Este es para el login con el token y que permita ver las consultas
    @PreAuthorize("hasRole('ADMIN')")
    @SecurityRequirement(name = "bearerAuth")
    public User login(
            @RequestParam("user") String username,
            @RequestParam("encryptedPass") String encryptedPass) {

        String token = jwtAuthenticationConfig.getJWTToken(username);
        return new User(username, encryptedPass, token);

    }


    @Operation(summary="Get all users for the application")
    @GetMapping("/findall")
    @PreAuthorize("hasRole('ADMIN')")
    @SecurityRequirement(name = "bearerAuth")
    public List<User> findAll(){
        return userService.findAll();
    }


}
