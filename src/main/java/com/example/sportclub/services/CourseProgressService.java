package com.example.sportclub.services;

import com.example.sportclub.dtos.CourseProgressDto;
import com.example.sportclub.entities.CourseProgressEntity;
import com.example.sportclub.mappers.IProgressGetMapper;
import com.example.sportclub.repos.ICourseProgressRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseProgressService {

    ICourseProgressRepository courseProgressRepository;

    public CourseProgressService(ICourseProgressRepository courseProgressRepository){
        this.courseProgressRepository = courseProgressRepository;
    }



    public List<CourseProgressDto> getAllProgressDto() {
        List<CourseProgressEntity> progresses = courseProgressRepository.findAll();
        return IProgressGetMapper.INSTANCE.progresstoGetAllProgressDto(progresses);
    }


    public CourseProgressDto CourseProgressDto(Long progressId) {
        Optional<CourseProgressEntity> optionalProgress = courseProgressRepository.findById(progressId);
        if(optionalProgress.isPresent()){
            return IProgressGetMapper.INSTANCE.progresstoGetProgressDto(optionalProgress.get());
        }else{
            throw new RuntimeException("Progress not found");
        }
    }

    public CourseProgressEntity createProgress(CourseProgressEntity newProgress) {
        return courseProgressRepository.save(newProgress);
    }

    public CourseProgressEntity updateProgress(Long progressId, CourseProgressEntity newProgress) {
        Optional<CourseProgressEntity> progress = courseProgressRepository.findById(progressId);
        if(progress.isPresent()){
            CourseProgressEntity foundedProgress = progress.get();
            foundedProgress.setRemaining_course(foundedProgress.getRemaining_course());
            courseProgressRepository.save(foundedProgress);
            return foundedProgress;
        }
        return null;
    }


    public void deleteProgress(Long progressId) {
        courseProgressRepository.deleteById(progressId);
    }
}
