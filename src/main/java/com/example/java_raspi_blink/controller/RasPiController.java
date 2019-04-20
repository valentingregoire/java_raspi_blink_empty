package com.example.java_raspi_blink.controller;

import com.example.java_raspi_blink.service.RasPiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/raspi")
public class RasPiController {

    private final RasPiService rasPiService;

    public RasPiController(RasPiService rasPiService) {
        this.rasPiService = rasPiService;
    }

    @GetMapping(path = "/blink")
    public String blink() {
        return this.rasPiService.blink();
    }
}
