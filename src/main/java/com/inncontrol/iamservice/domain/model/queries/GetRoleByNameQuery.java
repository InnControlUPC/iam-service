package com.inncontrol.iamservice.domain.model.queries;


import com.inncontrol.iamservice.domain.model.valueobjects.Roles;

public record GetRoleByNameQuery (Roles roleName) {
}
