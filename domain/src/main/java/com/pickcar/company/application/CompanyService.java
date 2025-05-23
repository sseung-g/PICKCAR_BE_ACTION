package com.pickcar.company.application;

import com.pickcar.company.domain.Company;
import com.pickcar.company.domain.ContractStatus;
import com.pickcar.company.infrastructure.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class CompanyService {

    private final CompanyRepository companyRepository;

    @Transactional
    public Company create() {
        //FIXME: 하드코딩 금지
        Company company = Company.builder()
                .name("name")
                .address("address")
                .businessPhoneNumber("phone")
                .email("email")
                .description("desc")
                .businessNumber("num")
                .contractStatus(ContractStatus.ACTIVE)
                .build();

        return companyRepository.save(company);     //FIXME: 반환 금지 
    }

    public Company getById(Long id) {
        //TODO: ID 기반 회사 조회

        return null;
    }
}
