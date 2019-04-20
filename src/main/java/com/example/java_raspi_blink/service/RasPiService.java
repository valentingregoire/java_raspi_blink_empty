package com.example.java_raspi_blink.service;

import org.springframework.stereotype.Service;

@Service
public class RasPiService {
    public String blink() {
        return "Blinking!";
    }
}
