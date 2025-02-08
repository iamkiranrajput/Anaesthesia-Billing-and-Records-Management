package com.guardians.ABRM.entity;


import com.guardians.ABRM.constant.PatientType;
import jakarta.persistence.*;


import java.time.LocalDateTime;

@Entity
public class Cases {

    @Id
    @GeneratedValue(strategy=GenerationType.UUID)
    private Integer id;
    private LocalDateTime surgeryDate;
    private String hospitalName;
    private String surgeonName;
    private String patientName;
    private String anaesthesiaType;

    @Enumerated(EnumType.STRING)
    private PatientType patientType;


    private String schemeDetails;

    private Double feeCharged;
    private Double amountReceived;
    private Double pendingAmount;

    private Integer userId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Cases() {
    }

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

