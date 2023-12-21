package com.example.client;

import com.example.client.Entities.Client;
import com.example.client.Repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }
    @Bean
    CommandLineRunner initializeH2Database(ClientRepository clientRepository) {
        return args -> {
            clientRepository.save(new Client("NASIR Houssam", Float.parseFloat("23")));
            clientRepository.save(new Client("ZE Hamza", Float.parseFloat("23")));
            clientRepository.save(new Client("Dan Zakariae", Float.parseFloat("23")));


        };
    }

}
