package com.guardians.ABRM.controller;


import com.guardians.ABRM.dto.CaseDTO;
import com.guardians.ABRM.dto.APIResponse;
import com.guardians.ABRM.service.CaseService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/Anaesthesia")
public class CasesController {

    private final CaseService caseService;
    public CasesController(CaseService caseService){
        this.caseService = caseService;
    }
    @PostMapping("/case")
    public ResponseEntity<APIResponse<CaseDTO>> addCase(@RequestBody @Valid CaseDTO caseDetails){

        APIResponse<CaseDTO> response = caseService.createCase(caseDetails);
//        log.info("case submitted successfully");
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
