package com.inncontrol.iamservice.domain.services;


import com.inncontrol.iamservice.domain.model.entities.Role;
import com.inncontrol.iamservice.domain.model.queries.GetAllRolesQuery;
import com.inncontrol.iamservice.domain.model.queries.GetRoleByNameQuery;

import java.util.List;
import java.util.Optional;

public interface RoleQueryService {
    List<Role> handle(GetAllRolesQuery query);
    Optional<Role> handle(GetRoleByNameQuery query);
}
