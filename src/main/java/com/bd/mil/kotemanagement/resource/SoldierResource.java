package com.bd.mil.kotemanagement.resource;

import com.bd.mil.kotemanagement.domain.Armament;
import com.bd.mil.kotemanagement.domain.Soldier;
import com.bd.mil.kotemanagement.service.ArmamentService;
import com.bd.mil.kotemanagement.service.SoldierService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SoldierResource {

    private final SoldierService soldierService;

    public SoldierResource(SoldierService soldierService) {
        this.soldierService = soldierService;
    }

    @GetMapping("/soldiers")
    public List<Soldier> findAllSoldiers() {
        return soldierService.findAll();
    }
}
