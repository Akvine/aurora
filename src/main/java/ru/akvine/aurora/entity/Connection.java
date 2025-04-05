package ru.akvine.aurora.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import ru.akvine.aurora.enums.DatabaseType;

import java.util.UUID;

@JmixEntity
@Entity
@Table(name = "DATABASE_CONNECTION")
public class Connection {
    @Id
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false, updatable = false)
    private UUID id;

    @NotNull
    @Column(name = "CONNECTION_NAME", nullable = false, unique = true)
    private String connectionName;

    @Nullable
    @Column(name = "DATABASE_NAME")
    private String databaseName;

    @Nullable
    @Column(name = "SCHEMA")
    private String schema;

    @NotNull
    @Column(name = "HOST", nullable = false)
    private String host;

    @NotNull
    @Column(name = "PORT", nullable = false)
    private String port;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "PASSWORD")
    private String password;

    @NotNull
    @Column(name = "DATABASE_TYPE", nullable = false)
    private String databaseType;

    public Connection() {
    }

    public @NotNull UUID getId() {
        return id;
    }

    public void setId(@NotNull UUID id) {
        this.id = id;
    }

    public @NotNull String getConnectionName() {
        return connectionName;
    }

    public void setConnectionName(@NotNull String connectionName) {
        this.connectionName = connectionName;
    }

    @Nullable
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(@Nullable String databaseName) {
        this.databaseName = databaseName;
    }

    @Nullable
    public String getSchema() {
        return schema;
    }

    public void setSchema(@Nullable String schema) {
        this.schema = schema;
    }

    public @NotNull String getHost() {
        return host;
    }

    public void setHost(@NotNull String host) {
        this.host = host;
    }

    public @NotNull String getPort() {
        return port;
    }

    public void setPort(@NotNull String port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public @NotNull DatabaseType getDatabaseType() {
        return DatabaseType.fromId(databaseType);
    }

    public void setDatabaseType(@NotNull DatabaseType databaseType) {
        this.databaseType = databaseType.getId();
    }
}
