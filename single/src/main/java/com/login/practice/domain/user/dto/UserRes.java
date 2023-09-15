package com.login.practice.domain.user.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class UserRes {

    private Long id;

    private String email;

    private String password;

    private String role;
}
