package com.inncontrol.iamservice.interfaces.rest.transform;


import com.inncontrol.iamservice.domain.model.entities.Role;
import com.inncontrol.iamservice.interfaces.rest.resources.RoleResource;

public class RoleResourceFromEntityAssembler {
    public static RoleResource toResourceFromEntity(Role role) {
        return new RoleResource(role.getId(), role.getStringName());
    }
}
