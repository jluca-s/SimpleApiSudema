package com.sudema.simpleapi.user.dto.request;

import com.sudema.simpleapi.user.model.Role;
import lombok.Data;

@Data
public class UserRequestDTO {
    private Long id;
    private String username;
    private String email;
    private String password;
    private Role role;
}
