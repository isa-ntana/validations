package com.br.zup.validations.services;

import com.br.zup.validations.controllers.dtos.UserDTO;
import com.br.zup.validations.controllers.dtos.UserRegisterDTO;
import com.br.zup.validations.services.mappers.UserMapper;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {
    private static final Logger log = LoggerFactory.getLogger(UserService.class);


    public UserDTO save(@Valid UserRegisterDTO userRegisterDTO){
        log.info("Registou");
        UserDTO userDTO =  UserMapper.toUserDTO(userRegisterDTO);
        userDTO.setId(UUID.randomUUID());
        return userDTO;
    }
}
