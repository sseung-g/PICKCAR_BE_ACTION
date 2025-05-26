package com.pickcar.company.domain;

import com.pickcar.global.domain.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@AllArgsConstructor
@Table(name = "companies")
@Builder(toBuilder = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Company extends BaseEntity {

    @Column(nullable = false)
    private String name;

    private String address;

    private String businessPhoneNumber;

    private String email;

    private String description;

    @Column(nullable = false)
    private String businessNumber;

    @Enumerated(EnumType.STRING)
    private ContractStatus contractStatus;
}
