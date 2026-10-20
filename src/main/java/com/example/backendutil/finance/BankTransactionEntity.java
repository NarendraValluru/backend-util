package com.example.backendutil.finance;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import java.time.Instant;
import java.util.UUID;
import java.math.BigDecimal;

@Getter @Setter @NoArgsConstructor
@Entity(name = "BankTransaction")
@Table(name = "bank_transactions", schema = "finance")
public class BankTransactionEntity {
    @Id private UUID id = UUID.randomUUID();
    private UUID ownerId;
    private UUID accountId;
    private UUID consentId;
    private String providerTxnId;
    @Column(precision = 19, scale = 4)
    private BigDecimal amount;
    private String direction;
    private Instant occurredAt;
    @Column(length = 2000)
    private String narration;
    private String mode;
    private Instant expiresAt;
    private Instant createdAt = Instant.now();
    @Version private long version;
}
