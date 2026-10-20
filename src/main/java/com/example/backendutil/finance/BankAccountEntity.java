package com.example.backendutil.finance;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import java.time.Instant;
import java.util.UUID;

@Getter @Setter @NoArgsConstructor
@Entity(name = "BankAccount")
@Table(name = "bank_accounts", schema = "finance")
public class BankAccountEntity {
    @Id private UUID id = UUID.randomUUID();
    private UUID ownerId;
    private String fipId;
    private String linkRef;
    private String maskedNumber;
    private String currency;
    private String accountType;
    private Instant lastSynced;
    private Instant createdAt = Instant.now();
    @Version private long version;
}
