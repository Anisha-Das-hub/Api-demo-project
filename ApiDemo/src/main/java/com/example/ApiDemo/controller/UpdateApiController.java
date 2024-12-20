
package com.example.ApiDemo.controller;


import com.example.ApiDemo.model.ApiResponse;
import com.example.ApiDemo.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdateApiController {
    @Autowired
    private ApiService apiService;

    @GetMapping("/testUpdateApi")
    public ResponseEntity<ApiResponse> testApi() {
        return apiService.testUpdateDataApi("002");
    }

    @PostMapping("/api/mdl/{serviceId}")
    public ResponseEntity<ApiResponse> submitApi(@PathVariable("serviceId") String serviceId) {
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setMsg("service id " + serviceId + " updated successfully");
        apiResponse.setResponsetime(0.014984130859375);
        apiResponse.setStatusCode(200);
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);

    }
}
