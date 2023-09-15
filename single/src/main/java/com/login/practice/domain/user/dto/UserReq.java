package com.login.practice.domain.user.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class UserReq {

    private String email;

    private String password;

    private String role;
}
