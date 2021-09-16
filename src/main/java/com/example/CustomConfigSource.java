package com.example;

import java.util.Set;
import org.eclipse.microprofile.config.spi.ConfigSource;

public class CustomConfigSource implements ConfigSource {
    static final String TEST_CUSTOM_PROPERTY = "test.custom.property";

    @Override
    public Set<String> getPropertyNames() {
        return Set.of(TEST_CUSTOM_PROPERTY);
    }

    @Override
    public String getValue(String propertyName) {
        return TEST_CUSTOM_PROPERTY.equals(propertyName) ? "success" : null;
    }

    @Override
    public String getName() {
        return "custom-test";
    }
}
