package com.example.backendutil.finance;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import java.time.Instant;
import java.util.UUID;

@Getter @Setter @NoArgsConstructor
@Entity(name = "BankDataSession")
@Table(name = "bank_data_sessions", schema = "finance")
public class BankDataSessionEntity {
    @Id private UUID id = UUID.randomUUID();
    private UUID ownerId;
    private UUID consentId;
    private String providerId;
    private String requestKey;
    private String payloadHash;
    private String status;
    private Instant fromTime;
    private Instant toTime;
    private Instant nextAttempt;
    private Instant dataExpiresAt;
    private int attempts;
    private String failureCode;
    private Instant createdAt = Instant.now();
    @Version private long version;
}
