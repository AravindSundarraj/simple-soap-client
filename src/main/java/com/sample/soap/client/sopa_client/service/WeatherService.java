//package com.sample.soap.client.sopa_client.service;
//
//import com.example.weather.NdfdXML;
//import com.example.weather.NdfdXMLPortType;
//import com.example.weather.LatLonListCityNames;
//import org.springframework.stereotype.Service;
//public class WeatherService {
//
//    private final NdfdXMLPortType weatherPort;
//
//    public WeatherService() {
//        NdfdXML service = new NdfdXML(); // This class was generated
//        this.weatherPort = service.getNdfdXMLPort(); // Port to communicate
//    }
//
//    public void getCityList() {
//        try {
//            LatLonListCityNames request = new LatLonListCityNames();
//            String result = weatherPort.latLonListCityNames(request);
//            System.out.println("Response: ");
//            System.out.println(result);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
