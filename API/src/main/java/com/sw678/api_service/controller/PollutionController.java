package com.sw678.api_service.controller;

import com.sw678.api_service.model.dto.PollutionDto;
import com.sw678.api_service.service.PollutionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pollution-service")
@CrossOrigin(origins = "http://localhost:3000")
public class PollutionController {
    private final Logger log = LoggerFactory.getLogger(getClass());
    private PollutionService pollutionService;

    @Autowired
    public PollutionController(PollutionService pollutionService) {
        this.pollutionService = pollutionService;
    }

    @GetMapping("/load")
    public List<PollutionDto> loadData(){
        log.info("\nPollutionService.showAirPollutionByLocation 호출");
        return pollutionService.showAirPollutionByLocation();
    }
}
