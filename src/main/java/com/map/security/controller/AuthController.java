package com.map.security.controller;

import com.map.security.request.LoginRequest;
import com.map.security.request.RegisterRequest;
import com.map.security.response.AuthResponse;
import com.map.security.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping(value = "/login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request)
    {
        return ResponseEntity.ok(authService.login(request));
    }

    @PostMapping(value = "/register")
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest request)
    {
        return ResponseEntity.ok(authService.register(request));
    }

    @GetMapping(value = "/validate/{token}")
    public ResponseEntity<Boolean> validateTGT(@PathVariable("token") String token) {
        return ResponseEntity.ok(authService.validateToken(token));
    }
}
