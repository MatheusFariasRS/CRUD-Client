package com.clintProject.client.controllers;

import com.clintProject.client.dto.ClientDTO;
import com.clintProject.client.entities.Client;
import com.clintProject.client.repositories.ClientRepository;
import com.clintProject.client.services.ClientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    @Autowired
    private ClientServices services;

    @GetMapping(value = "/{id}")
    public ResponseEntity<ClientDTO> findById(@PathVariable Long id){
        ClientDTO dto = services.findById(id);
        return ResponseEntity.ok(dto);
    }

}
