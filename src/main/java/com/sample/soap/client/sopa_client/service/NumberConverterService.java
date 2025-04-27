package com.sample.soap.client.sopa_client.service;


import com.example.generated.NumberConversion;
import com.example.generated.NumberConversionSoapType;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;

@Service
public class NumberConverterService {

    private final NumberConversionSoapType calculatorSoap = null;

    public String NumberConverterServices() {
        NumberConversion service = new NumberConversion();

        // Get the port (proxy) to call methods
        NumberConversionSoapType port = service.getNumberConversionSoap();

        // Now call the methods
        BigInteger num = BigInteger.valueOf(12345);
        String words = port.numberToWords(num);

        System.out.println("Number in words: " + words);
        return words;
    }

}
