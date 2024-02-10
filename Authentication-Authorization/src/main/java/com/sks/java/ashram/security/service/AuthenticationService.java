package com.sks.java.ashram.security.service;

import com.sks.java.ashram.security.dao.request.SignUpRequest;
import com.sks.java.ashram.security.dao.request.SigninRequest;
import com.sks.java.ashram.security.dao.response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SigninRequest request);
}
