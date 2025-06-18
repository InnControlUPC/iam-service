package com.inncontrol.iamservice.application.internal.commandservices;


import com.inncontrol.iamservice.domain.model.commands.SeedRolesCommand;
import com.inncontrol.iamservice.domain.model.entities.Role;
import com.inncontrol.iamservice.domain.model.valueobjects.Roles;
import com.inncontrol.iamservice.domain.services.RoleCommandService;
import com.inncontrol.iamservice.infrastructure.persistence.jpa.repositories.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class RoleCommandServiceImpl implements RoleCommandService {
    private final RoleRepository roleRepository;

    public RoleCommandServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public void handle( SeedRolesCommand command) {
        Arrays.stream(Roles.values()).forEach(role -> {
            if(!roleRepository.existsByName(role)) {
                roleRepository.save(new Role(Roles.valueOf(role.name())));
            }
        });
    }
}
