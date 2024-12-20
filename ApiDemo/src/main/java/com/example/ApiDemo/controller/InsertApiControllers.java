package com.example.ApiDemo.controller;

import com.example.ApiDemo.domain.AppData;
import com.example.ApiDemo.model.ApiResponse;
import com.example.ApiDemo.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InsertApiControllers {
    @Autowired
    ApiService apiService;

    @GetMapping("/testInsertApi")
    public ResponseEntity<ApiResponse> testApi() {
        return apiService.testInsertDataApi();
    }

    @PostMapping("/ortpsa/api/insert")
    public ResponseEntity<ApiResponse> submitApi(@RequestBody AppData appData) {
        System.out.println("app data details : " + appData);
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setMsg("Data saved successfully");
        apiResponse.setStatusCode(200);
        apiResponse.setResponsetime(0.014984130859375);
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);

    }
}
