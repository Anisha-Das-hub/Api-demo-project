package com.example.ApiDemo.service;


import com.example.ApiDemo.domain.AppData;
import com.example.ApiDemo.model.ApiResponse;
import com.example.ApiDemo.model.AppDataRequestBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;


@Service
public class ApiService {
    RestTemplate restTemplate = new RestTemplate();
    @Autowired
    AppDataRequestBuilder appDataRequestBuilder;

    public ResponseEntity<ApiResponse> testInsertDataApi() {
        String apiUrl = "http://localhost:9090/ortpsa/api/insert";
        AppData appData = appDataRequestBuilder.buildAppDataForInsert();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<AppData> request = new HttpEntity<>(appData, headers);

        ResponseEntity<ApiResponse> response = restTemplate.exchange(
                apiUrl,
                HttpMethod.POST,
                request,
                ApiResponse.class
        );
        return response;
    }

    public ResponseEntity<ApiResponse> testUpdateDataApi(String serviceId) {
        String apiUrl = "http://localhost:9090/api/mdl/{serviceId}";
        AppData appUpdData = appDataRequestBuilder.buildAppDataForUpdate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<AppData> request = new HttpEntity<>(appUpdData, headers);
        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("serviceId", serviceId);

        ResponseEntity<ApiResponse> response = restTemplate.exchange(
                apiUrl,
                HttpMethod.POST,
                request,
                ApiResponse.class,
                uriVariables
        );
        return response;
    }
}
