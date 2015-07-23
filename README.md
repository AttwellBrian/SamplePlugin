# Sample Android Gradle Plugin

This is an example of the project described at http://stackoverflow.com/questions/17664183/creating-a-gradle-custom-plugin-with-java

This project contains a simple gradle plugin, and a sample android app that uses it.

This project is structured around deploying the plugin to maven repos (this will make eventual publishing easier), therefore you need to execute a command in order to deploy to a local maven repo before the `sample_app` module can use the plugin. 

## Usage

Every time you change the plugin implementation and want to use the updated plugin inside your sample app, execute “./gradlew uploadArchives”. Next, build normally. 

**Upon downloading**, you must execute “./gradlew uploadArchives” at least once with “sample_app” removed from settings.gradle. After you’ve done this a local maven repo will be created with the plugin that can be used by “sample_app”.
