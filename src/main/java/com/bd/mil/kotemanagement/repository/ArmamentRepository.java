package com.bd.mil.kotemanagement.repository;

import com.bd.mil.kotemanagement.domain.Armament;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArmamentRepository extends JpaRepository<Armament, Long> {

}
