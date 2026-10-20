package com.example.backendutil.finance;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import java.time.Instant;
import java.util.UUID;

@Getter @Setter @NoArgsConstructor
@Entity(name = "SetuWebhookEvent")
@Table(name = "setu_webhook_events", schema = "finance")
public class SetuWebhookEventEntity {
    @Id private UUID id = UUID.randomUUID();
    private String eventKey;
    private String providerConsentId;
    private String providerSessionId;
    private String eventType;
    private String status;
    private int attempts;
    private Instant nextAttempt;
    private String failureCode;
    private Instant createdAt = Instant.now();
    @Version private long version;
}
