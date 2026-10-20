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
@Entity(name = "AuthSession")
@Table(name = "auth_sessions", schema = "auth")
public class AuthSessionEntity {
    @Id
    private UUID id = UUID.randomUUID();

    @Column(nullable = false)
    private UUID userId;

    @Column(nullable = false, unique = true, length = 64)
    private String refreshHash;

    @Column(nullable = false)
    private Instant expiresAt;

    private boolean revoked;

    public AuthSessionEntity(UUID userId, String hash, Instant expiry) {
        this.userId = userId;
        refreshHash = hash;
        expiresAt = expiry;
    }
}
