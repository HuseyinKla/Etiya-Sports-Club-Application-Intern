package com.example.sportclub.controllers;

import com.example.sportclub.dtos.LogGetDto;
import com.example.sportclub.entities.LogEntity;
import com.example.sportclub.services.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/logs")
public class LogController {

    @Autowired
    private LogService logService;

    public LogController(LogService logService){
        this.logService = logService;
    }

    @GetMapping
    public List<LogGetDto> getAllLogsDto(){
        return logService.getAllLogsDto();
    }

    @GetMapping("/{logId}")
    public LogGetDto findOneLogDto(@PathVariable Long logId){
        return logService.findOneLogDto(logId);
    }

    /*@GetMapping("/{user_id}")
    public List<LogGetDto> findLogDtobyUserId(@PathVariable Long user_id){
        return logService.findLogDtobyUserId(user_id);
    }*/


    @PostMapping
    public LogEntity createNewLog(@RequestBody LogEntity newLog){
        return logService.createNewLog(newLog);

    }




}
