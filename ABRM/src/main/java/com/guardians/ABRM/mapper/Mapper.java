package com.guardians.ABRM.mapper;

import com.guardians.ABRM.dto.CaseDTO;
import com.guardians.ABRM.entity.Cases;


import org.springframework.stereotype.Component;


@Component
public class Mapper {

    public CaseDTO ResponseToDTO(Cases response) {

        CaseDTO dto = new CaseDTO();
        dto.setId(response.getId());
        dto.setSurgeryDate(response.getSurgeryDate());
        dto.setHospitalName(response.getHospitalName());
        dto.setSurgeonName(response.getSurgeonName());
        dto.setAmountReceived(response.getAmountReceived());
        dto.setAnaesthesiaType(response.getAnaesthesiaType());
        dto.setPatientType(response.getPatientType());
        dto.setSchemeDetails(response.getSchemeDetails());
        dto.setFeeCharged(response.getFeeCharged());
        dto.setAmountReceived(response.getAmountReceived());
        dto.setPendingAmount(response.getPendingAmount());

        return dto;
    }


    public Cases dtoToResponse(CaseDTO dto) {

        Cases res = new Cases();
        res.setSurgeryDate(dto.getSurgeryDate());
        res.setHospitalName(dto.getHospitalName());
        res.setSurgeonName(dto.getSurgeonName());
        res.setAmountReceived(dto.getAmountReceived());
        res.setAnaesthesiaType(dto.getAnaesthesiaType());
        res.setPatientType(dto.getPatientType());
        res.setSchemeDetails(dto.getSchemeDetails());
        res.setFeeCharged(dto.getFeeCharged());
        res.setAmountReceived(dto.getAmountReceived());
        res.setPendingAmount(dto.getPendingAmount());
        return res;
    }

    public Mapper() {
    }
}
