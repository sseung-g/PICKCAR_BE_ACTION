package company.domain;

@Entity
@Table(name = "companies")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String address;

    private String businessPhoneNumber;

    private String email;

    private String description;

    private String businessNumber;

    @Enumerated(EnumType.String)
    private ContractStatus contractStatus;
}
