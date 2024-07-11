package com.robertomessabrasil.carreseller.domain.entity.user;

public final class UserRoleVO {

    private final UserRoleEnum roleEnum;

    public UserRoleVO(UserRoleEnum role) {
        this.roleEnum = role;
    }

    public UserRoleEnum getRoleEnum() {
        return roleEnum;
    }
}