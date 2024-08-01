package com.bridge.red.back.controller;


import com.bridge.red.back.dto.JwtAuthenticationResponse;
import com.bridge.red.back.dto.SignInRequest;
import com.bridge.red.back.dto.SignUpRequest;
import jakarta.validation.Valid;
import com.bridge.red.back.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final Logger logger = LoggerFactory.getLogger(AuthController.class);

    private final AuthenticationService authenticationService;

    @PostMapping(path="/sign-up", consumes= MediaType.APPLICATION_JSON_VALUE)
    public JwtAuthenticationResponse signUp(@RequestBody @Valid SignUpRequest request) {
        return authenticationService.signUp(request);
    }

    @PostMapping(path="/sign-in", consumes= MediaType.APPLICATION_JSON_VALUE)
    public JwtAuthenticationResponse signIn(@RequestBody @Valid SignInRequest request) {
        return authenticationService.signIn(request);
    }
}