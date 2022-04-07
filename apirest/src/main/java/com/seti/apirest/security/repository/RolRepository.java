package com.seti.apirest.security.repository;

import com.seti.apirest.security.entity.Rol;
import com.seti.apirest.security.enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
//Notación que indica que es un repositorio
@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {

    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}

