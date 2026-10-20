package com.example.backendutil.finance;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import java.time.Instant;
import java.util.UUID;

@Getter @Setter @NoArgsConstructor
@Entity(name = "BankConsent")
@Table(name = "bank_consents", schema = "finance")
public class BankConsentEntity {
    @Id private UUID id = UUID.randomUUID();
    private UUID ownerId;
    private String providerId;
    private String requestKey;
    private String payloadHash;
    private String status;
    @Column(length = 2048)
    private String approvalUrl;
    private Instant fromTime;
    private Instant toTime;
    private Instant expiresAt;
    private String dataLifeUnit;
    private int dataLifeValue;
    private Instant createdAt = Instant.now();
    @Version private long version;
}
