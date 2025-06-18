package com.inncontrol.iamservice.domain.model.commands;



import com.inncontrol.iamservice.domain.model.entities.Role;

import java.util.List;

public record SignUpCommand(String username, String password, List<Role> roles) {
}
