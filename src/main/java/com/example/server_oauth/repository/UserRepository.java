package com.example.server_oauth.repository;

import com.example.server_oauth.bd.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<Usuario , Long> {
    Optional<Usuario> findByCodigo(String codigo);
}
