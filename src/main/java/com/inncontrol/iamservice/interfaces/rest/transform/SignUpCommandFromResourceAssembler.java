package com.inncontrol.iamservice.interfaces.rest.transform;


import com.inncontrol.iamservice.domain.model.commands.SignUpCommand;
import com.inncontrol.iamservice.domain.model.entities.Role;
import com.inncontrol.iamservice.interfaces.rest.resources.SignUpResource;

import java.util.ArrayList;

public class SignUpCommandFromResourceAssembler {
    public static SignUpCommand toCommandFromResource(SignUpResource resource) {
        var roles = resource.roles() != null ? resource.roles().stream().map(name -> Role.toRoleFromName(name)).toList() : new ArrayList<Role>();
        return new SignUpCommand(resource.username(), resource.password(), roles);
    }
}
