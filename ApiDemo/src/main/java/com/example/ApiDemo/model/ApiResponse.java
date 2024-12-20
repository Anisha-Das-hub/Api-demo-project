package com.example.ApiDemo.model;

public class ApiResponse {
    private String msg;
    private double responsetime;
    private int statusCode;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public double getResponsetime() {
        return responsetime;
    }

    public void setResponsetime(double responsetime) {
        this.responsetime = responsetime;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
}
