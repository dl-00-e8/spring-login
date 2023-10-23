package com.login.practice.domain.user.controller;

import com.login.practice.domain.user.dto.UserReq;
import com.login.practice.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class UserController {

    private final UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<Void> signup(@RequestBody UserReq userReq) {

        return ResponseEntity.status(HttpStatus.OK)
                .body(null);
    }

    @PostMapping("/signin")
    public ResponseEntity<Void> signin(@RequestBody UserReq userReq) {

        return ResponseEntity.status(HttpStatus.OK)
                .body(null);
    }

    @PostMapping("/signout")
    public ResponseEntity<Void> signout(@RequestBody UserReq userReq) {

        return ResponseEntity.status(HttpStatus.OK)
                .body(null);
    }

    @PostMapping("/withdrawal")
    public ResponseEntity<Void> withdrawal(@RequestBody UserReq userReq) {

        return ResponseEntity.status(HttpStatus.OK)
                .body(null);
    }

    @PostMapping("/reissue")
    public ResponseEntity<Void> reissue() {

        return ResponseEntity.status(HttpStatus.OK)
                .body(null);
    }
}
