package com.lucasandrade.security.mapper;

import com.lucasandrade.security.dto.request.PermissionRequest;
import com.lucasandrade.security.dto.response.PermissionResponse;
import com.lucasandrade.security.entity.Permission;

public class PermissionMapper {

    public Permission toPermission(PermissionRequest request){
        return Permission.builder()
                .description(request.description())
                .build();
    }
    public PermissionResponse toResponse(Permission permission){
        return PermissionResponse.builder()
                .id(permission.getId())
                .description(permission.getDescription())
                .build();
    }
}
