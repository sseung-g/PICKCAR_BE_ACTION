package auth.domain;

import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Embeddable
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserInfo {
    //슈퍼 어드인, 관리자(혹은 일반회원)에 대한 정적인 정보를 분리하기 위한 클래스
    private String email;

    private String password;

    private String name;

    private String phoneNumber;
}
