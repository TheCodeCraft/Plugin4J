package org.plugin4j.annotations;

import org.plugin4j.PluginLoadPriority;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Plugin {

    String name();

    PluginLoadPriority priority();
    String version();
    String mainClass();
    String[] authors();

}
