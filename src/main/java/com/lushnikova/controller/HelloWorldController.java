package com.lushnikova.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Api(value = "/api", produces = "Operation")
public class HelloWorldController {
  private final ObjectMapper objectMapper = new ObjectMapper();
  @RequestMapping("/hello")
  public String sayHello() throws JsonProcessingException {
    return objectMapper.writeValueAsString("Hello World");
  }
}