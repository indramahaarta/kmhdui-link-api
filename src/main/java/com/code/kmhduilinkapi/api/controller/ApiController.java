package com.code.kmhduilinkapi.api.controller;

import com.code.kmhduilinkapi.api.model.LinkRequestDTO;
import com.code.kmhduilinkapi.api.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private ApiService apiService;

    @PostMapping(path = "/addCustomLink", consumes = {"application/json"})
    public ResponseEntity addCustomLink(@RequestBody LinkRequestDTO linkRequestDto) {
        return ResponseEntity.ok(apiService.addCustomLink(linkRequestDto));
    }
}
