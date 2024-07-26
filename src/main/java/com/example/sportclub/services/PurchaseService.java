package com.example.sportclub.services;

import com.example.sportclub.entities.PurchaseEntity;
import com.example.sportclub.repos.IPurchaseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseService {

    IPurchaseRepository purchaseRepository;

    public PurchaseService(IPurchaseRepository purchaseRepository){
        this.purchaseRepository = purchaseRepository;
    }

    public List<PurchaseEntity> getAllPurchases() {
        return purchaseRepository.findAll();
    }

    public PurchaseEntity findOnePurchase(Long purchaseId) {
        return purchaseRepository.findById(purchaseId).orElse(null);
    }

    public PurchaseEntity createPurchase(PurchaseEntity newPurchase) {
        return purchaseRepository.save(newPurchase);
    }


    public void deletePurchase(Long purchaseId) {
        purchaseRepository.deleteById(purchaseId);
    }
}
