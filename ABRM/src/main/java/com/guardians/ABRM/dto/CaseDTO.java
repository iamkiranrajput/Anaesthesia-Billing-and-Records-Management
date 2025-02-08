package com.guardians.ABRM.dto;

import com.guardians.ABRM.constant.PatientType;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import java.time.LocalDateTime;

public class CaseDTO {

    private Integer id;

    @NotNull(message = "Surgery date cannot be null")
    @JsonFormat(pattern = "yyyy-MM-dd-HH:mm:ss")
    private LocalDateTime surgeryDate;

    @NotBlank(message = "Hospital name cannot be empty")

    private String hospitalName;

    @NotBlank(message = "Surgeon name cannot be empty")

    private String surgeonName;

    private String patientName;

    @NotBlank(message = "Anaesthesia type cannot be empty")

    private String anaesthesiaType;

    @Enumerated(EnumType.STRING)
    @NotNull(message= "Invalid value for PatientType. Accepted values are: PAYING, SCHEME.")
    private PatientType patientType;

    private String schemeDetails;

    @Min(value = 0, message = "Fee charged must be at least 0")
    private double feeCharged;

    @Min(value = 0, message = "Amount received must be at least 0")
    private double amountReceived;

    @Min(value = 0, message = "Pending amount must be at least 0")
    private double pendingAmount;

    // Getters and setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getSurgeryDate() {
        return surgeryDate;
    }

    public void setSurgeryDate(LocalDateTime surgeryDate) {
        this.surgeryDate = surgeryDate;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getSurgeonName() {
        return surgeonName;
    }

    public void setSurgeonName(String surgeonName) {
        this.surgeonName = surgeonName;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getAnaesthesiaType() {
        return anaesthesiaType;
    }

    public void setAnaesthesiaType(String anaesthesiaType) {
        this.anaesthesiaType = anaesthesiaType;
    }

    public PatientType getPatientType() {
        return patientType;
    }

    public void setPatientType(PatientType patientType) {
        this.patientType = patientType;
    }

    public String getSchemeDetails() {
        return schemeDetails;
    }

    public void setSchemeDetails(String schemeDetails) {
        this.schemeDetails = schemeDetails;
    }

    public double getFeeCharged() {
        return feeCharged;
    }

    public void setFeeCharged(double feeCharged) {
        this.feeCharged = feeCharged;
    }

    public double getAmountReceived() {
        return amountReceived;
    }

    public void setAmountReceived(double amountReceived) {
        this.amountReceived = amountReceived;
    }

    public double getPendingAmount() {
        return pendingAmount;
    }

    public void setPendingAmount(double pendingAmount) {
        this.pendingAmount = pendingAmount;
    }
}
