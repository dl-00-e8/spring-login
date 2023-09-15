package com.login.practice.domain.user.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class LoginRes {

    private Long id;

    private String email;

    private String password;

    private String role;

    private String accessToken;

    private String refreshToken;
}
