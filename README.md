# VisiProb

## Overview

This is an app to visually display the results of probability calculations.

## Development Instructions

### Running Locally

To run, cd into the root-level directory of the project, and enter

```
mvn clean javafx:run
```

### Getting started with JavaFX

There are a few things you'll need to do:

1. Create a new Maven project from the JavaFX archetype

2. Create a directory structure matching your main package under src/main/resources, and place a directory under that named "fxml".  (Names are somewhat arbitrary.)

3. Create a .fxml file under the directory created in step 2.

4. Change the code in your main class to look like the code in this sample project, only, replace the path to the fxml file
with the one you created.

5. Add the javafx-fxml dependency to your pom.  Not included in the archetype, but required to use .fxml files.

6. Create a controller class somewhere in your project (it doesn't matter where), and create a new public void method in it to handle an event.

7. Add the controller class to the exports in module-info.java.

8. Register the controller in the .fxml file as a whole by looking under the controller details in the .fxml file and entering the fully qualified path to the class, e.g., "com.simplegeek.visiprob..controllers.MainController".

9. Now, you can just reference the names of methods in the controller class as event handlers for the various controls.

10. You'll need to "open" the package containing any code that has injected JavaFX controls (i.e., uses the @FXML annotation).  You can add a line to your module-info.java like this "opens com.package.my;".