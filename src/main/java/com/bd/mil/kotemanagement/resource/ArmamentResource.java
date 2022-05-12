package com.bd.mil.kotemanagement.resource;

import com.bd.mil.kotemanagement.domain.Armament;
import com.bd.mil.kotemanagement.service.ArmamentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ArmamentResource {
    private final ArmamentService armamentService;

    public ArmamentResource(ArmamentService armamentService) {
        this.armamentService = armamentService;
    }

    @GetMapping("/armaments")
    public List<Armament> findAllArmaments() {
        return armamentService.findAll();
    }
}
