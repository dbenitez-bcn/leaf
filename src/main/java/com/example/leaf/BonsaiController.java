package com.example.leaf;

import org.springframework.web.bind.annotation.GetMapping;
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
}
