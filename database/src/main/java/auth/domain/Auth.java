package auth.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//FIXME: 토큰을 저장하는 테이블이 별도로 필요할까요 user에서 관리하는건?
//@Entity
//public class Auth {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String accessToken;
//
//    private String refreshToken;
//}
