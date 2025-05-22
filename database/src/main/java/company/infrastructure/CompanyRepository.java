package company.infrastructure;

import company.domain.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
