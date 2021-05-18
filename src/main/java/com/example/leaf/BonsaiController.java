package com.example.leaf;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BonsaiController {

    private final BonsaiService service;

    public BonsaiController(BonsaiService service) {
        this.service = service;
    }

    @GetMapping("/bonsai")
    List<Bonsai> getBonsais() {
        return service.getBonsais();
    }

    @PutMapping("/bonsai/{id}")
    ResponseEntity<String> sellBonsai(@PathVariable("id") Long id) {
        service.sell(id);
        return ResponseEntity.status(202).body("Bonsai sold!");
    }
}
