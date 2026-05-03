package com.lucasandrade.security.dto.response;

import com.lucasandrade.security.entity.Permission;
import lombok.Builder;

import java.util.List;

@Builder
public record UserResponse(Long id,
                           String name,
                           String email,
                           List<Permission> permissions) {
}
