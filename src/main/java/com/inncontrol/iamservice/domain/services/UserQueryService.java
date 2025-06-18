package com.inncontrol.iamservice.domain.services;


import com.inncontrol.iamservice.domain.model.aggregates.User;
import com.inncontrol.iamservice.domain.model.queries.GetAllUsersQuery;
import com.inncontrol.iamservice.domain.model.queries.GetUserByIdQuery;
import com.inncontrol.iamservice.domain.model.queries.GetUserByUsernameQuery;

import java.util.List;
import java.util.Optional;

public interface UserQueryService {
    List<User> handle(GetAllUsersQuery query);
    Optional<User> handle(GetUserByIdQuery query);
    Optional<User> handle(GetUserByUsernameQuery query);
}
