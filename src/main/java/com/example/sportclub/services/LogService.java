package com.example.sportclub.services;


import com.example.sportclub.entities.LogEntity;
import com.example.sportclub.repos.ILogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogService {


    private ILogRepository logRepository;

    public LogService(ILogRepository logRepository){
        this.logRepository = logRepository;
    }

    public List<LogEntity> getAllLogs() {
        return logRepository.findAll();
    }

    public LogEntity createNewLog(LogEntity newLog) {
        return logRepository.save(newLog);
    }
}
