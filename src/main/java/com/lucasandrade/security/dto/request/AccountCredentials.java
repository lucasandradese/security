package com.lucasandrade.security.dto.request;

import lombok.Builder;

@Builder
public record AccountCredentials(String email, String password) {

}
