package com.lucasandrade.security.dto.response;

import lombok.Builder;

import java.util.Date;

@Builder

public record Token(
        String email,
        Boolean authenticated,
        Date created,
        Date expiration,
        String accessToken,
        String refreshToken
) {
}
