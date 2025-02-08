package com.guardians.ABRM.service;

import com.guardians.ABRM.dto.CaseDTO;
import com.guardians.ABRM.dto.APIResponse;

public interface CaseService {
    APIResponse<CaseDTO> createCase(CaseDTO cases);
    APIResponse<CaseDTO> updateCase(CaseDTO cases);

}
