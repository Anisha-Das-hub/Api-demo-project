package com.example.ApiDemo.domain;

public class AppData {
    private String apiKey;
    private String applicationId;
    private String departmentId;
    private String serviceId;
    private String districtId;
    private String blockId;
    private String grampanchayatId;
    private String tahasilId;
    private String officeId;
    private String applicationStatus;
    private String applicantName;
    private String applicantAddress;
    private String applicantPhoneNo;
    private String applicationReceivedDate;
    private String lastDate;
    private String acknowledgementNumber;
    private String deliveryStatus;
    private String deliveryDate;
    private String rejectedReason;
    private String applyMode;
    private String designatedOfficerName;
    private String designatedOfficerId;
    private String description;

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getDistrictId() {
        return districtId;
    }

    public void setDistrictId(String districtId) {
        this.districtId = districtId;
    }

    public String getBlockId() {
        return blockId;
    }

    public void setBlockId(String blockId) {
        this.blockId = blockId;
    }

    public String getGrampanchayatId() {
        return grampanchayatId;
    }

    public void setGrampanchayatId(String grampanchayatId) {
        this.grampanchayatId = grampanchayatId;
    }

    public String getTahasilId() {
        return tahasilId;
    }

    public void setTahasilId(String tahasilId) {
        this.tahasilId = tahasilId;
    }

    public String getOfficeId() {
        return officeId;
    }

    public void setOfficeId(String officeId) {
        this.officeId = officeId;
    }

    public String getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getApplicantAddress() {
        return applicantAddress;
    }

    public void setApplicantAddress(String applicantAddress) {
        this.applicantAddress = applicantAddress;
    }

    public String getApplicantPhoneNo() {
        return applicantPhoneNo;
    }

    public void setApplicantPhoneNo(String applicantPhoneNo) {
        this.applicantPhoneNo = applicantPhoneNo;
    }

    public String getApplicationReceivedDate() {
        return applicationReceivedDate;
    }

    public void setApplicationReceivedDate(String applicationReceivedDate) {
        this.applicationReceivedDate = applicationReceivedDate;
    }

    public String getLastDate() {
        return lastDate;
    }

    public void setLastDate(String lastDate) {
        this.lastDate = lastDate;
    }

    public String getAcknowledgementNumber() {
        return acknowledgementNumber;
    }

    public void setAcknowledgementNumber(String acknowledgementNumber) {
        this.acknowledgementNumber = acknowledgementNumber;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getRejectedReason() {
        return rejectedReason;
    }

    public void setRejectedReason(String rejectedReason) {
        this.rejectedReason = rejectedReason;
    }

    public String getApplyMode() {
        return applyMode;
    }

    public void setApplyMode(String applyMode) {
        this.applyMode = applyMode;
    }

    public String getDesignatedOfficerName() {
        return designatedOfficerName;
    }

    public void setDesignatedOfficerName(String designatedOfficerName) {
        this.designatedOfficerName = designatedOfficerName;
    }

    public String getDesignatedOfficerId() {
        return designatedOfficerId;
    }

    public void setDesignatedOfficerId(String designatedOfficerId) {
        this.designatedOfficerId = designatedOfficerId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "AppData{" +
                "apiKey='" + apiKey + '\'' +
                ", applicationId='" + applicationId + '\'' +
                ", departmentId='" + departmentId + '\'' +
                ", serviceId='" + serviceId + '\'' +
                ", districtId='" + districtId + '\'' +
                ", blockId='" + blockId + '\'' +
                ", grampanchayatId='" + grampanchayatId + '\'' +
                ", tahasilId='" + tahasilId + '\'' +
                ", officeId='" + officeId + '\'' +
                ", applicationStatus='" + applicationStatus + '\'' +
                ", applicantName='" + applicantName + '\'' +
                ", applicantAddress='" + applicantAddress + '\'' +
                ", applicantPhoneNo='" + applicantPhoneNo + '\'' +
                ", applicationReceivedDate='" + applicationReceivedDate + '\'' +
                ", lastDate='" + lastDate + '\'' +
                ", acknowledgementNumber='" + acknowledgementNumber + '\'' +
                ", deliveryStatus='" + deliveryStatus + '\'' +
                ", deliveryDate='" + deliveryDate + '\'' +
                ", rejectedReason='" + rejectedReason + '\'' +
                ", applyMode='" + applyMode + '\'' +
                ", designatedOfficerName='" + designatedOfficerName + '\'' +
                ", designatedOfficerId='" + designatedOfficerId + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
