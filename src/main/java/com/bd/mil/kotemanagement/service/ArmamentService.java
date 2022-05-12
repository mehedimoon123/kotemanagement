package com.bd.mil.kotemanagement.service;

import com.bd.mil.kotemanagement.domain.Armament;
import com.bd.mil.kotemanagement.repository.ArmamentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArmamentService {
    private final ArmamentRepository armamentRepository;

    public ArmamentService(ArmamentRepository armamentRepository) {
        this.armamentRepository = armamentRepository;
    }

    public List<Armament> findAll() {
        return armamentRepository.findAll();
    }
}
