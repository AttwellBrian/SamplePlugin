package com.brianattwell.plugin;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class MyJavaTask extends DefaultTask {

    @TaskAction
    public void javaTask() {
        System.out.println("Hello from MyJavaTask");
    }

}
