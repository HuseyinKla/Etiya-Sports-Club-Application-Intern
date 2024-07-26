package com.example.sportclub.controllers;


import com.example.sportclub.entities.PurchaseEntity;
import com.example.sportclub.services.PurchaseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchases")
public class PurchaseController {

    PurchaseService purchaseService;

    public PurchaseController(PurchaseService purchaseService){
        this.purchaseService = purchaseService;
    }

    @GetMapping
    public List<PurchaseEntity> getAllPurchases(){
        return purchaseService.getAllPurchases();
    }

    @GetMapping("/{purchaseId}")
    public PurchaseEntity findOnePurchase(@PathVariable Long purchaseId){
        return purchaseService.findOnePurchase(purchaseId);
    }

    @PostMapping
    public PurchaseEntity createPurchase(@RequestBody PurchaseEntity newPurchase){
        return purchaseService.createPurchase(newPurchase);
    }

    @DeleteMapping("/{purchaseId}")
    public void deletePurchase(@PathVariable Long purchaseId){
        purchaseService.deletePurchase(purchaseId);
    }


}
