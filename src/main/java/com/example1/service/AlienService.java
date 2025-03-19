package com.example1.service;

import com.example1.model.Alien;
import com.example1.repository.AlienRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

@Service
public class AlienService {

    @Autowired
    private AlienRepo alienRepo;

    public void saveAlien(Alien alien) {
        alienRepo.save(alien);
    }
}
