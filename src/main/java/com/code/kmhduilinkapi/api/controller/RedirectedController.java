package com.code.kmhduilinkapi.api.controller;

import com.code.kmhduilinkapi.api.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class RedirectedController {
    @Autowired
    private ApiService apiService;

    @GetMapping(path = "/{customUrl}")
    public ModelAndView redirectPage(@PathVariable("customUrl") String customUrl) {
        String link = apiService.getLink(customUrl);
        return new ModelAndView("redirect:" + link);
    }
}
