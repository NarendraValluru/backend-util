package com.example.backendutil.auth;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name = "AuthUser")
@Table(name = "auth_users", schema = "auth")
public class AuthUserEntity {
    @Id
    private UUID id = UUID.randomUUID();

    @Column(nullable = false, unique = true, length = 254)
    private String email;

    @Column(nullable = false)
    private String passwordHash;


    @Column(nullable = false)
    private String role = "USER";

    private int failedAttempts;

    private Instant lockedUntil;

    public AuthUserEntity(String email, String passwordHash) {
        this.email = email;
        this.passwordHash = passwordHash;
    }
}
