package com.example.sportclub.repos;

import com.example.sportclub.entities.PurchaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPurchaseRepository extends JpaRepository<PurchaseEntity, Long> {
}
