package com.sudema.simpleapi.user.mapper;

import com.sudema.simpleapi.user.dto.request.UserRequestDTO;
import com.sudema.simpleapi.user.dto.response.UserResponseDTO;
import com.sudema.simpleapi.user.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User toEntity(UserRequestDTO dto) {
        return User.builder()
                .username(dto.getUsername())
                .email(dto.getEmail())
                .password(dto.getPassword())
                .role(dto.getRole())
                .build();
    }

    public UserResponseDTO toDto(User user) {
        return UserResponseDTO.builder()
                .id(user.getId())
                .username(user.getUsername())
                .email(user.getEmail())
                .role(user.getRole())
                .build();
    }
}
