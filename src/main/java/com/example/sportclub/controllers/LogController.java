package com.example.sportclub.controllers;

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
    public List<LogEntity> getAllLogs(){
        return logService.getAllLogs();
    }

    @PostMapping
    public LogEntity createNewLog(@RequestBody LogEntity newLog){
        return logService.createNewLog(newLog);

    }




}
