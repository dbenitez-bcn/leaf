package com.example.leaf;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BonsaiService {
    private final BonsaiRepository repository;

    public BonsaiService(BonsaiRepository repository) {
        this.repository = repository;
    }

    public List<Bonsai> getBonsais() {
        return repository.findAll();
    }
}
