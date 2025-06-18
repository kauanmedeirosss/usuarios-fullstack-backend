package io.github.lorimedeiros.fullstack_backend.repository;

import io.github.lorimedeiros.fullstack_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
