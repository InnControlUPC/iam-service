package com.inncontrol.iamservice.interfaces.rest.transform;


import com.inncontrol.iamservice.domain.model.commands.SignInCommand;
import com.inncontrol.iamservice.interfaces.rest.resources.SignInResource;

public class SignInCommandFromResourceAssembler {
    public static SignInCommand toCommandFromResource(SignInResource signInResource) {
        return new SignInCommand(signInResource.username(), signInResource.password());
    }
}
