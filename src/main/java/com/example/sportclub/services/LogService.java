package com.example.sportclub.services;


import com.example.sportclub.dtos.LogGetDto;
import com.example.sportclub.entities.LogEntity;
import com.example.sportclub.mappers.ILogGetMapper;
import com.example.sportclub.repos.ILogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LogService {

    @Autowired
    private ILogRepository logRepository;

    public LogService(ILogRepository logRepository){
        this.logRepository = logRepository;
    }

    public List<LogGetDto> getAllLogsDto() {

        List<LogEntity> logs = logRepository.findAll();

        return ILogGetMapper.INSTANCE.logToGetLogsDto(logs);
    }

    public LogEntity createNewLog(LogEntity newLog) {
        return logRepository.save(newLog);
    }

    public LogGetDto findOneLogDto(Long logId) {
        Optional<LogEntity> logOptional = logRepository.findById(logId);
        if (logOptional.isPresent()){
            return ILogGetMapper.INSTANCE.logToGetLogDto(logOptional.get());
        }else{
            throw new RuntimeException("Log not found");
        }

    }

    /*public List<LogGetDto> findLogDtobyUserId(Long user_id) {
        List<LogEntity> logEntities = logRepository.findByUser_UserId(user_id);
        return ILogGetMapper.INSTANCE.logsToGetLogsDtos(logEntities);
    }*/
}
