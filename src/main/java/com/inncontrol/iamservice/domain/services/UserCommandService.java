package com.inncontrol.iamservice.domain.services;


import com.inncontrol.iamservice.domain.model.aggregates.User;
import com.inncontrol.iamservice.domain.model.commands.RefreshTokenCommand;
import com.inncontrol.iamservice.domain.model.commands.SignInCommand;
import com.inncontrol.iamservice.domain.model.commands.SignUpCommand;
import org.apache.commons.lang3.tuple.ImmutablePair;

import java.util.Optional;

public interface UserCommandService {
    Optional<User> handle(SignUpCommand command);
    Optional<ImmutablePair<User, String>> handle(SignInCommand command);
    Optional<ImmutablePair<User, String>> handle(RefreshTokenCommand command);
}
