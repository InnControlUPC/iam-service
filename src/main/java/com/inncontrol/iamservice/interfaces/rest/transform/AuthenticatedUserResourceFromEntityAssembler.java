package com.inncontrol.iamservice.interfaces.rest.transform;


import com.inncontrol.iamservice.domain.model.aggregates.User;
import com.inncontrol.iamservice.interfaces.rest.resources.AuthenticatedUserResource;

public class AuthenticatedUserResourceFromEntityAssembler {
    public static AuthenticatedUserResource toResourceFromEntity(User user, String token) {
        return new AuthenticatedUserResource(user.getId(), user.getUsername(), user.getSerializedRoles(), token);
    }
}
