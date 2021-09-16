package com.example;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.junit.jupiter.api.Test;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class CustomConfigSourceIT {
    @ConfigProperty(name = CustomConfigSource.TEST_CUSTOM_PROPERTY)
    String testProperty;

    @Test
    public void mustInjectCustomProperty() {
        assertThat(testProperty, is("success"));
    }
}
