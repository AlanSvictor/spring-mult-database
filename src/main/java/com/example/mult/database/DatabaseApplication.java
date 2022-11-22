package com.example.mult.database;

import com.example.mult.database.entity.primary.Client.Client;
import com.example.mult.database.entity.secondary.User.User;
import com.example.mult.database.repository.primary.client.ClientRepository;
import com.example.mult.database.repository.secondary.user.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
@Slf4j
@SpringBootApplication
public class DatabaseApplication {



    public static void main(String[] args) {
        SpringApplication.run(DatabaseApplication.class, args);
    }


    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    public void insert() {
        List<Client> clients = Arrays.asList(
                Client.builder().name("client name 01").email("client1@test.mail.com").build(),
                Client.builder().name("client name 02").email("client2@test.mail.com").build(),
                Client.builder().name("client name 03").email("client3@test.mail.com").build(),
                Client.builder().name("client name 04").email("client4@test.mail.com").build()
        );
        log.info("Inserting of clients");
        clientRepository.saveAll(clients);


        List<User> users = Arrays.asList(
                User.builder().name("User name 01").email("user1@test.mail.com").build(),
                User.builder().name("User name 02").email("user2@test.mail.com").build(),
                User.builder().name("User name 03").email("user3@test.mail.com").build(),
                User.builder().name("User name 04").email("user4@test.mail.com").build()
        );
        log.info("Inserting of clients");
        userRepository.saveAll(users);

    }

}
