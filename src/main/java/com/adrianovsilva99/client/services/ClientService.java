package com.adrianovsilva99.client.services;

import com.adrianovsilva99.client.dto.ClientDTO;
import com.adrianovsilva99.client.entities.Client;
import com.adrianovsilva99.client.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Optional<Client> result = repository.findById(id);
        Client client = result.get();
        return new ClientDTO(client);
    }
}