package com.example.crudoperation.Repository;

import com.example.crudoperation.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
