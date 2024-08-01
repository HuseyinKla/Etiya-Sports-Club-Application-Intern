package com.example.sportclub.services;

import com.example.sportclub.dtos.CourseBundleDto;
import com.example.sportclub.entities.CourseBundleEntity;
import com.example.sportclub.mappers.IBundleGetMapper;
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

    public List<CourseBundleDto> getAllBundlesDto() {
        List<CourseBundleEntity> bundles = courseBundleRepository.findAll();
        return IBundleGetMapper.INSTANCE.bundlestoBundlesGetDto(bundles);


    }

    public CourseBundleDto getOneBundleDto(Long bundleId) {
        Optional<CourseBundleEntity> bundleOptional = courseBundleRepository.findById(bundleId);
        if (bundleOptional.isPresent()){
            return IBundleGetMapper.INSTANCE.bundleToBundleDto(bundleOptional.get());
        }else{
            throw new RuntimeException("Bundle not found");
        }

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
