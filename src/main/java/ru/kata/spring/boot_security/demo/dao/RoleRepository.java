package ru.kata.spring.boot_security.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.entity.Role;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
