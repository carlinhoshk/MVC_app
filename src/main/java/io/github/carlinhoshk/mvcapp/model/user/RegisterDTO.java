package io.github.carlinhoshk.mvcapp.model.user;

public record RegisterDTO(String login, String password, UserRole role) {
}
