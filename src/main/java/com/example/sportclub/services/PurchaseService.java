package com.example.sportclub.services;

import com.example.sportclub.dtos.PurchaseGetDto;
import com.example.sportclub.entities.PurchaseEntity;
import com.example.sportclub.mappers.IPurchaseGetMapper;
import com.example.sportclub.repos.IPurchaseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {

    IPurchaseRepository purchaseRepository;

    public PurchaseService(IPurchaseRepository purchaseRepository){
        this.purchaseRepository = purchaseRepository;
    }

    public List<PurchaseGetDto> getAllPurchasesDto() {
        List<PurchaseEntity> purchases = purchaseRepository.findAll();
        return IPurchaseGetMapper.INSTANCE.purchasesToGetAllPurchaseDto(purchases);
    }

    public PurchaseGetDto findOnePurchaseDto(Long purchaseId) {
        Optional<PurchaseEntity> optionalPurchase = purchaseRepository.findById(purchaseId);
        if(optionalPurchase.isPresent()){
            return IPurchaseGetMapper.INSTANCE.purchaseToGetPurchaseDto(optionalPurchase.get());
        }else{
            throw new RuntimeException("Purchase not found");
        }
    }

    public PurchaseEntity createPurchase(PurchaseEntity newPurchase) {
        return purchaseRepository.save(newPurchase);
    }


    public void deletePurchase(Long purchaseId) {
        purchaseRepository.deleteById(purchaseId);
    }
}
