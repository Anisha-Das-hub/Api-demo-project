package com.example.ApiDemo.model;


import com.example.ApiDemo.domain.AppData;
import org.springframework.stereotype.Component;

@Component
public class AppDataRequestBuilder {
    public AppData buildAppDataForInsert() {
        AppData appData = new AppData();
        appData.setApiKey("2f79ca81376b7b94");
        appData.setApplicationId("APP001");
        appData.setAcknowledgementNumber("04000301002ACK001");
        appData.setDepartmentId("01");
        appData.setServiceId("002");
        appData.setDistrictId("04");
        appData.setBlockId("1");
        appData.setTahasilId("1");
        appData.setGrampanchayatId("1");
        appData.setOfficeId("00003");
        appData.setApplicationStatus("1");
        appData.setApplicantName("Raghav Raj");
        appData.setApplicantAddress("BBSR");
        appData.setApplicantPhoneNo("9800968990");
        appData.setApplicationReceivedDate("2022-06-01");
        appData.setLastDate("2022-07-01");
        appData.setDeliveryStatus("N/A");
        appData.setDeliveryDate("N/A");
        appData.setRejectedReason("N/A");
        appData.setApplyMode("Online");
        appData.setDesignatedOfficerName("Amulya Pattnayak");
        appData.setDesignatedOfficerId("1");
        appData.setDescription("N/A");
        return appData;
    }

    public AppData buildAppDataForUpdate() {
        AppData appUpdData = new AppData();
        appUpdData.setApiKey("2f79ca81376b7b94");
        appUpdData.setAcknowledgementNumber("04000301002ACK001");
        appUpdData.setDepartmentId("01");
        appUpdData.setServiceId("002");
        appUpdData.setDistrictId("04");
        appUpdData.setApplicationStatus("5");
        appUpdData.setRejectedReason("Invalid Document");
        appUpdData.setApplicationId("APP001");
        return appUpdData;
    }


}
