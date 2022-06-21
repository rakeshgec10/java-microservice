package com.config.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.config.fileconfig.Configuration;

@RefreshScope
@RestController
public class ConfigController {

	 @Autowired
	    Configuration configuration;

	    @GetMapping("/endpoint")
	    public String retrieveLimits(){
	        return configuration.getValue();
	    }
}
