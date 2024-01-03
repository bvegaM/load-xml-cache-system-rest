package com.load.xml.controller;

import com.load.xml.service.ConfigService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/configs")
@RequiredArgsConstructor
public class ConfigController {

    private final ConfigService configService;


    @GetMapping
    public ResponseEntity<String> getDescription(@RequestParam("code") String code){
        return ResponseEntity.ok().body(configService.getDescription(code));
    }
}
