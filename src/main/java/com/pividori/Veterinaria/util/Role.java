package com.pividori.Veterinaria.util;

import java.util.Arrays;
import java.util.List;

public enum Role {

    ADMIN(Arrays.asList(Permission.CREATE_DATE, Permission.EDIT_DATE, Permission.VIEW_PETS)),
    VETERINARIAN(Arrays.asList(Permission.VIEW_PETS)),
    SECRETARY(Arrays.asList(Permission.CREATE_DATE, Permission.EDIT_DATE));

    private List<Permission> permissions;

    Role(List<Permission> permissions) {
        this.permissions = permissions;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }
}
