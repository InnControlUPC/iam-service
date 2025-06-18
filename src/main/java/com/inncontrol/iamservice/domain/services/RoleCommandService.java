package com.inncontrol.iamservice.domain.services;


import com.inncontrol.iamservice.domain.model.commands.SeedRolesCommand;

public interface RoleCommandService {
    void handle(SeedRolesCommand command);
}
