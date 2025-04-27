package com.sample.soap.client.sopa_client.controller;


import com.sample.soap.client.sopa_client.service.NumberConverterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private final NumberConverterService numberConverterService;

    public CalculatorController(NumberConverterService numberConverterService) {
        this.numberConverterService = numberConverterService;
    }

    @GetMapping("/con")
    public String add() {
      return  numberConverterService.NumberConverterServices();
    }


}
