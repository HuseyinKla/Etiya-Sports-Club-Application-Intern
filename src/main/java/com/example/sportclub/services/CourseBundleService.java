package com.example.sportclub.services;

import com.example.sportclub.entities.CourseBundleEntity;
import com.example.sportclub.repos.ICourseBundleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseBundleService {

    ICourseBundleRepository courseBundleRepository;

    public CourseBundleService(ICourseBundleRepository courseBundleRepository){
        this.courseBundleRepository = courseBundleRepository;
    }

    public List<CourseBundleEntity> getAllBundles() {
        return courseBundleRepository.findAll();
    }

    public CourseBundleEntity getOnebundle(Long bundleId) {
        return courseBundleRepository.findById(bundleId).orElse(null);
    }


    public CourseBundleEntity updateBundle(Long bundleId, CourseBundleEntity newBundle) {
        Optional<CourseBundleEntity> bundle = courseBundleRepository.findById(bundleId);
        if(bundle.isPresent()){
            CourseBundleEntity foundedBundle = bundle.get();
            foundedBundle.setBundle_price(newBundle.getBundle_price());
            courseBundleRepository.save(foundedBundle);
            return foundedBundle;
        }
        return null;
    }

    public CourseBundleEntity createNewBundle(CourseBundleEntity newBundle) {
        return courseBundleRepository.save(newBundle);
    }
}
