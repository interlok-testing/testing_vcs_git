package com.adaptris.vcs.test;

import com.adaptris.testing.SingleAdapterFunctionalTest;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DefaultFunctionalTest extends SingleAdapterFunctionalTest {

    private File getConfigDir() {
        return Paths.get("./config/interlok-config-example").toFile();
    }

    private void deleteConfigDir() throws IOException {
        File configDir = getConfigDir();
        if (configDir.exists()) {
            FileUtils.deleteDirectory(configDir);;
        }
    }

    @BeforeAll
    public void setup() throws Exception {
        deleteConfigDir();
        super.setup();
    }

    @AfterAll
    public void tearDown() throws Exception {
        super.tearDown();
        deleteConfigDir();
    }

    @Test
    public void test() {
        File configDir = getConfigDir();
        assertTrue(configDir.exists());
    }
}
