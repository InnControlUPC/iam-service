package com.inncontrol.iamservice.interfaces.rest.transform;


import com.inncontrol.iamservice.domain.model.aggregates.User;
import com.inncontrol.iamservice.domain.model.entities.Role;
import com.inncontrol.iamservice.interfaces.rest.resources.UserResource;

public class UserResourceFromEntityAssembler {
    public static UserResource toResourceFromEntity(User user) {
        var roles = user.getRoles().stream().map(Role::getStringName).toList();
        return new UserResource(user.getId(), user.getUsername(), roles);
    }
}
