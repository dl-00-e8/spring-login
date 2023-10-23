package com.login.practice.global.filter;

import com.login.practice.global.jwt.TokenProvider;
import com.login.practice.global.redis.RedisService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@RequiredArgsConstructor
public class JwtFilter extends OncePerRequestFilter {

    private final TokenProvider tokenProvider;
    private final RedisService redisService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        try {
            String token = resolveToken(request);

            if(StringUtils.hasText(token) && tokenProvider.validateToken(token)) {
                // 로그아웃하며 사용불가능한 토큰이 접근할 경우
                if(redisService.getValue(token).equals("signout")) {

                }
            }
        } catch (Exception e) {

        }

        filterChain.doFilter(request, response);
    }


    /**
     * Bearer Token에 대해서 앞에 붙은 Bearer 문자열 제거 메소드
     * @param request - request에서 헤더 정보 중 토큰 관련된 정보 추출해서 사용
     * @return Bearer 문자열을 제거한 토큰 값 반환
     */
    private String resolveToken(HttpServletRequest request) {
        String bearerToken = request.getHeader("Authorization");

        if(StringUtils.hasText(bearerToken) && bearerToken.startsWith("Bearer")) {
            return bearerToken.substring(7);
        }

        return null;
    }


}
