package com.login.practice.global.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component
@RequiredArgsConstructor
@Log4j2
public class JwtTokenProvider {

    private final RedisTemplate<String, String> redisTemplate;

    @Value("${jwt.secret")
    private String secretKey;

    // ATK 만료시간: 1일
    private static final long accessTokenExpirationTime = 24 * 60 * 60 * 1000L;

    // RTK 만료시간: 30일
    private static final long refreshTokenExpirationTime = 30 * 24 * 60 * 60 * 1000L;

    /**
     * ATK 생성
     */
    public String createAccessToken(Authentication authentication) {

        return "";
    }

}
