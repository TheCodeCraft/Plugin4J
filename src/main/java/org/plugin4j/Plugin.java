package org.plugin4j;

import lombok.Getter;

@Getter
public abstract class Plugin {

    private final String name;
    private final PluginLoadPriority priority;
    private final String version;
    private final String mainClass;
    private final String[] authors;

    public Plugin() {
        this.name = this.getClass().getAnnotation(org.plugin4j.annotations.Plugin.class).name();
        this.priority = this.getClass().getAnnotation(org.plugin4j.annotations.Plugin.class).priority();
        this.version = this.getClass().getAnnotation(org.plugin4j.annotations.Plugin.class).version();;
        this.mainClass = this.getClass().getAnnotation(org.plugin4j.annotations.Plugin.class).mainClass();;
        this.authors = this.getClass().getAnnotation(org.plugin4j.annotations.Plugin.class).authors();;
    }

    public abstract void load();
    public abstract void unload();
}
