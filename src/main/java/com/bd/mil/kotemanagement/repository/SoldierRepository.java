package com.bd.mil.kotemanagement.repository;

import com.bd.mil.kotemanagement.domain.Soldier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoldierRepository extends JpaRepository<Soldier, Long> {

}
