package project.cookdoc.global.result;

import lombok.AllArgsConstructor;
import lombok.Getter;

/** {행위}_{목적어}_{성공여부} message 는 동사 명사형으로 마무리 */
@Getter
@AllArgsConstructor
public enum ResultCode {

    // 도메인 별로 나눠서 관리
    // Member
    SHOP_REGISTRATION_SUCCESS("S001", "음식점 등록 성공"),
    ;

    private final String code;
    private final String message;
}