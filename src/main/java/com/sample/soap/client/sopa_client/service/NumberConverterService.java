package com.sample.soap.client.sopa_client.service;


import com.example.generated.NumberConversion;
import com.example.generated.NumberConversionSoapType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;

/*
Can we use NumberConversionSoapType directly without NumberConversion?
No, you cannot directly instantiate NumberConversionSoapType because:

NumberConversionSoapType is just an interface.

It does not have an implementation.

CXF at runtime will create a proxy (dynamic implementation) using the NumberConversion service class.

📦 Why NumberConversion service = new NumberConversion(); is needed?
The NumberConversion class is generated to load the WSDL.

It creates a dynamic proxy for the interface NumberConversionSoapType.

It knows which WSDL, which endpoint, and how to bind everything together.
 */
@Service
public class NumberConverterService {



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
