package com.sudema.simpleapi.user.repository;

import com.sudema.simpleapi.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {


    @Query(value = "SELECT TOP 100 * FROM PROCESSO", nativeQuery = true)
    List<Object> findTop100ProcessosByOrderByIdDesc();
}
