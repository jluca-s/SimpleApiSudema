package com.sudema.simpleapi.user.repository;

import com.sudema.simpleapi.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
