package com.brianattwell.plugin;

import org.gradle.api.Project;
import org.gradle.api.Plugin;

public class MyJavaPlugin implements Plugin<Project> {
    @Override
    public void apply(Project target) {
        target.task("javaTask");
    }
}