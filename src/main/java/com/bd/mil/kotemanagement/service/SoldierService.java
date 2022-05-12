package com.bd.mil.kotemanagement.service;

import com.bd.mil.kotemanagement.domain.Soldier;
import com.bd.mil.kotemanagement.repository.SoldierRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoldierService {
    private final SoldierRepository soldierRepository;

    public SoldierService(SoldierRepository soldierRepository) {
        this.soldierRepository = soldierRepository;
    }

    public List<Soldier> findAll() {
        return soldierRepository.findAll();
    }
}
