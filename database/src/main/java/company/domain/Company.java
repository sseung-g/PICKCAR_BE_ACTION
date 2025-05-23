package company.domain;

import auth.domain.User;
import global.domain.BaseEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@AllArgsConstructor
@Table(name = "companies")
@SuperBuilder(toBuilder = true)
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
