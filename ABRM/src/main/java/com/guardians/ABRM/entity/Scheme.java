package com.guardians.ABRM.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter

public class Scheme {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Integer id;
    private String schemeName;
    private String coverageDetails;
    private String validityPeriod;
    private Integer caseId;

    public Scheme() {
    }

    public void setSchemeName(String schemeName) {
        this.schemeName = schemeName;
    }

    public void setCoverageDetails(String coverageDetails) {
        this.coverageDetails = coverageDetails;
    }

    public void setValidityPeriod(String validityPeriod) {
        this.validityPeriod = validityPeriod;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }
}
