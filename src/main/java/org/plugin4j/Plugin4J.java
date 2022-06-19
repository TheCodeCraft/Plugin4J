package org.plugin4j;

import lombok.Getter;

import java.io.File;

@Getter
public class Plugin4J {

    public static final Plugin4J create(boolean log, File directory) {
        return new Plugin4J(log, directory);
    }

    private final boolean log;
    private final File directory;

    private Plugin4J(boolean log, File directory) {
        this.log = log;
        this.directory = directory;
    }

}
