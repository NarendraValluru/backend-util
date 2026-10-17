# backend-util

Shared Java 21 Maven JAR for WalletX persistence entity classes. Uses the same Spring Boot 4.1.0 dependency management and Lombok compiler setup as walletx-auth. This library is not a running microservice and has no port or application.properties.

Build from the workspace root using `walletx-auth/mvnw.cmd -f backend-util/pom.xml install`, or build both modules with the root aggregator. Authentication imports these classes through a Maven dependency and registers them using `@EntityScan`.

Keep authentication data ownership and migrations in walletx-auth. Do not serialize entities containing password/session hashes to clients.
