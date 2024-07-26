package com.example.sportclub.controllers;


import com.example.sportclub.entities.CourseBundleEntity;
import com.example.sportclub.services.CourseBundleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bundles")
public class CourseBundleController {

    CourseBundleService courseBundleService;

    public CourseBundleController(CourseBundleService courseBundleService){
        this.courseBundleService = courseBundleService;
    }

    @GetMapping
    public List<CourseBundleEntity> getAllBundles(){
        return courseBundleService.getAllBundles();
    }

    @GetMapping("/{bundleId}")
    public CourseBundleEntity getOneBundle(@PathVariable Long bundleId){
        return courseBundleService.getOnebundle(bundleId);
    }

    @PutMapping("/{bundleId}")
    public CourseBundleEntity updateBundle(@PathVariable Long bundleId, @RequestBody CourseBundleEntity newBundle){
        return courseBundleService.updateBundle(bundleId, newBundle);
    }




}
