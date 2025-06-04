package com.simplestore.repositories;

import com.simplestore.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import com.simplestore.repositories.RoleRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByNome(String nome);
}
