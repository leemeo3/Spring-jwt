package com.sparta.board.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Pattern;


@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SignupRequestDto {
    @Pattern(regexp = "[a-z0-9]{4,10}", message = "최소 4자 이상, 10자 이하이며 알파벳 소문자(a~z), 숫자(0~9)")
    private String username;
    @Pattern(regexp = "[a-zA-Z0-9]{8,15}", message = "최소 8자 이상, 15자 이하이며 알파벳 대소문자(a~z, A~Z), 숫자(0~9)")
    private String password;
    private boolean admin = false;
    private String adminToken = "";
}