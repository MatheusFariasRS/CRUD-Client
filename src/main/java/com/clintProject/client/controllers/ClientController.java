package com.clintProject.client.controllers;

import com.clintProject.client.dto.ClientDTO;
import com.clintProject.client.entities.Client;
import com.clintProject.client.repositories.ClientRepository;
import com.clintProject.client.services.ClientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    @Autowired
    private ClientServices service;

    @GetMapping(value = "/{id}")
    public ClientDTO findById(@PathVariable Long id){
       return service.findById(id);
    }

    @GetMapping
    public Page<ClientDTO> findAll(Pageable pageable){
        return  service.findAll(pageable);
    }

    @PostMapping
    public ClientDTO insert(@RequestBody ClientDTO dto){
        return service.insert(dto);
    }

    @PutMapping(value = "/{id}")
    public ClientDTO update(@PathVariable Long id, @RequestBody ClientDTO dto){
        return service.update(id, dto);
    }
}
