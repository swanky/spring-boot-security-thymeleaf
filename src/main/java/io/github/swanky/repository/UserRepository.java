package io.github.swanky.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.swanky.domain.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findOneByEmail(String email);

}