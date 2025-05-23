package com.pickcar.company.presentation.dto.request;

import com.pickcar.company.domain.ContractStatus;

//FIXME: 이름 변경
public record CompanyJoinRequest(
        String name,
        String address,
        String businessPhoneNumber,
        String email,
        String description,
        String businessNumber,
        ContractStatus contractStatus
) {
}
