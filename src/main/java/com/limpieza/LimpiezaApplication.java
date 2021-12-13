package com.limpieza;

import com.limpieza.repository.crud.UserCrudRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

import com.limpieza.repository.crud.CleanCrudRepository;

@Component
@SpringBootApplication
public class LimpiezaApplication implements CommandLineRunner {

    @Autowired
    private UserCrudRepository userRepo;

    @Autowired
    private CleanCrudRepository supRepo;

    public static void main(String[] args) {
        SpringApplication.run(LimpiezaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        userRepo.deleteAll();
        supRepo.deleteAll();


            
    }

}
