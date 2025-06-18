package com.inncontrol.iamservice.infrastructure.hashing.bcrypt;

import com.inncontrol.iamservice.application.internal.outboundservices.hashing.HashingService;
import org.springframework.security.crypto.password.PasswordEncoder;

public interface BCryptHashingService  extends HashingService, PasswordEncoder {

}
