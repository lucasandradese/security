package com.lucasandrade.security.dto.response;

import lombok.Builder;

@Builder
public record PermissionResponse(Long id, String description) {
}
