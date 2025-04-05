package ru.akvine.aurora.enums;

import io.jmix.core.metamodel.datatype.EnumClass;
import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotNull;

public enum DatabaseType implements EnumClass<String> {
    POSTGRESQL("PostgreSQL");

    private final String id;

    @Nullable
    public static DatabaseType fromId(String id) {
        for (DatabaseType dbType : DatabaseType.values()) {
            if (dbType.getId().equals(id)) {
                return dbType;
            }
        }

        return null;
    }

    DatabaseType(String id) {
        this.id = id;
    }

    @NotNull
    public String getId() {
        return id;
    }
}
