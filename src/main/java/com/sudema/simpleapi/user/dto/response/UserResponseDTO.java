package com.sudema.simpleapi.user.dto.response;

import com.sudema.simpleapi.user.model.Role;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserResponseDTO {
    private Long id;
    private String username;
    private String email;
    private Role role;
}
