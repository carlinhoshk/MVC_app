package io.github.carlinhoshk.mvcapp.repositories;

import io.github.carlinhoshk.mvcapp.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User, String> {
    UserDetails findByLogin(String login);
}
