package com.guardians.ABRM.service;

import com.guardians.ABRM.dto.CaseDTO;
import com.guardians.ABRM.dto.APIResponse;
import com.guardians.ABRM.entity.Cases;

import com.guardians.ABRM.mapper.Mapper;
import com.guardians.ABRM.repository.CasesRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;



@Service
public class CaseServiceImpl implements CaseService {

    private final CasesRepository anaesthesiaCasesRepository;
    private final Mapper mapper;
    public CaseServiceImpl(CasesRepository anaesthesiaCasesRepository, Mapper mapper) {
        this.anaesthesiaCasesRepository = anaesthesiaCasesRepository;
        this.mapper = mapper;
    }


    @Override
    public APIResponse<CaseDTO> createCase(CaseDTO cases) {

        Cases cases1 = mapper.dtoToResponse(cases);
        Cases response = anaesthesiaCasesRepository.save(cases1);
        CaseDTO dto = mapper.ResponseToDTO(response);

        APIResponse<CaseDTO> apiResponse = new APIResponse<>();

        apiResponse.setData(dto);
        apiResponse.setMessage("Data Saved SuccessFully");
        apiResponse.setStatus(String.valueOf(HttpStatus.CREATED));

        return apiResponse;


    }



    @Override
    public APIResponse<CaseDTO> updateCase(CaseDTO cases) {

        return new APIResponse<>();

    }
}

