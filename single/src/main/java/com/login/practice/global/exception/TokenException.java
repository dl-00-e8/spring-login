package com.login.practice.global.exception;

import lombok.Getter;

@Getter
public class TokenException extends RuntimeException {

    public TokenException(String e) {
        super(e);
    }
}
