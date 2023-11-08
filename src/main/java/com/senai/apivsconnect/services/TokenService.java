package com.senai.apivsconnect.services;

import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TokenService {
    @Value("${api.security.token.secret}")
    private String secret;

    private final Algorithm algoritmo = Algorithm.HMAC256(secret);


}
