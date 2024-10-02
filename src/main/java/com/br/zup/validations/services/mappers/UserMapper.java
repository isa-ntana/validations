package com.br.zup.validations.services.mappers;

import com.br.zup.validations.controllers.dtos.UserDTO;
import com.br.zup.validations.controllers.dtos.UserRegisterDTO;
import jakarta.validation.Valid;

public class UserMapper {

    public static UserDTO toUserDTO(UserRegisterDTO userRegisterDTO){
        return new UserDTO(
                userRegisterDTO.getName(),
                userRegisterDTO.getAge(),
                userRegisterDTO.getYearOfBirth(),
                userRegisterDTO.getEmail()
                );
    }
}
