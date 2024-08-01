package com.example.sportclub.controllers;


import com.example.sportclub.dtos.CourseBundleDto;
import com.example.sportclub.entities.CourseBundleEntity;
import com.example.sportclub.entities.RoleEntity;
import com.example.sportclub.entities.UserEntity;
import com.example.sportclub.services.CourseBundleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public List<CourseBundleDto> getAllBundlesDto(){
        return courseBundleService.getAllBundlesDto();
    }

    @GetMapping("/{bundleId}")
    public CourseBundleDto getOneBundleDto(@PathVariable Long bundleId){
        return courseBundleService.getOneBundleDto(bundleId);
    }

    @PostMapping
    public CourseBundleEntity createNewBundle(@RequestBody CourseBundleEntity newBundle){
        return courseBundleService.createNewBundle(newBundle);
    }



    @PutMapping("/{bundleId}")
    public CourseBundleEntity updateBundle(@PathVariable Long bundleId, @RequestBody CourseBundleEntity newBundle){
        return courseBundleService.updateBundle(bundleId, newBundle);
    }




}
