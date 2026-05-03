package com.lucasandrade.security.dto.request;

import com.lucasandrade.security.entity.Permission;

import java.util.List;

public record UserRequest(String name,
                          String email,
                          String password,
                          List<Long> permissions) {
}
