package com.example.crudCliente.service.impl;

import com.example.crudCliente.controller.Client;
import com.example.crudCliente.service.ClientService;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ClientServiceImpl implements ClientService {
    @Override
    public Client updateClient(String id, Client client) {
        Client clientNew = loadClient(id); // lo que debería hacer es cargar el cliente de ese id y actualizarlo y grabarlo
        clientNew.setDocument(client.getDocument());
        clientNew.setFirstName(client.getFirstName());
        clientNew.setLastName(client.getLastName());
        clientNew.setEmail(client.getEmail());
        clientNew.setPhone(client.getPhone());
        clientNew.setCreatedDate(new Date());
        return clientNew;
    }

    @Override
    public boolean removeClient(String id) {
        if(id.equals("43630233") ){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public Client loadClient(String id) {
        Client clientNew = new Client();
        clientNew.setId(id);
        clientNew.setDocument("71790754");
        clientNew.setFirstName("Juan");
        clientNew.setLastName("Zuluaga");
        clientNew.setEmail("jzulu2000@gmail.com");
        clientNew.setPhone("3023325522");
        clientNew.setCreatedDate(new Date());
        return clientNew;
    }

    @Override
    public Client createClient(Client client) {
        Client clientNew = new Client();
        clientNew.setId(String.valueOf((int)(Math.random()*10)));
        clientNew.setDocument(client.getDocument());
        clientNew.setFirstName(client.getFirstName());
        clientNew.setLastName(client.getLastName());
        clientNew.setEmail(client.getEmail());
        clientNew.setPhone(client.getPhone());
        clientNew.setCreatedDate(new Date());
        return clientNew;
    }
}
