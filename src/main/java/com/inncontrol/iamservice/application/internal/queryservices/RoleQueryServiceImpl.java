package com.inncontrol.iamservice.application.internal.queryservices;


import com.inncontrol.iamservice.domain.model.entities.Role;
import com.inncontrol.iamservice.domain.model.queries.GetAllRolesQuery;
import com.inncontrol.iamservice.domain.model.queries.GetRoleByNameQuery;
import com.inncontrol.iamservice.domain.services.RoleQueryService;
import com.inncontrol.iamservice.infrastructure.persistence.jpa.repositories.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleQueryServiceImpl implements RoleQueryService {
    private final RoleRepository roleRepository;

    public RoleQueryServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<Role> handle(GetAllRolesQuery query) {
        return roleRepository.findAll();
    }

    @Override
    public Optional<Role> handle(GetRoleByNameQuery query) {
        return roleRepository.findByName(query.roleName());
    }
}
