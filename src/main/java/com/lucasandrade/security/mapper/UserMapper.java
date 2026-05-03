package com.lucasandrade.security.mapper;

import com.lucasandrade.security.dto.request.UserRequest;
import com.lucasandrade.security.dto.response.UserResponse;
import com.lucasandrade.security.entity.Permission;
import com.lucasandrade.security.entity.User;

import java.util.List;

public class UserMapper {



    public User toUser(UserRequest request) {

        List<Permission> permissions = request.permissions().stream()
                .map(permissionId -> Permission.builder().id(permissionId).build())
                .toList();

        return User.builder()
                .name(request.name())
                .email(request.email())
                .password(request.password())
                .permissions(permissions)
                .build();
    }

    public UserResponse toResponse(User user) {

        List<Permission> permissions = user.getPermissions().stream()
                .map(permission -> Permission.builder()
                        .id(permission.getId())
                        .description(permission.getDescription())
                        .build())
                .toList();


        return UserResponse.builder()
                .id(user.getId())
                .name(user.getName())
                .email(user.getEmail())
                .permissions(permissions)
                .build();
    }
}
