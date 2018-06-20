# Example 1 - Software Design and Patterns

This is an example of object-oriented programming.  
This example illustrates OOP basic concepts of abstraction, encapsulation, inheritance and polymorphism. 


# How to compile the project

Use Apache Maven to compile and run this project

```bash
mvn clean compile
```

# How to create a binary runable package 


```bash
mvn clean compile assembly:single
```



or 


```bash
mvn clean package
```



# How to run


```bash
java -classpath target/Example-1-1.0-SNAPSHOT-jar-with-dependencies.jar edu.bu.met.cs665.Main
```

or


```bash
run.sh 
```

# Using Findbugs 

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using  


```bash
mvn findbugs:gui 
```

or 


```bash
mvn findbugs:findbugs
```

# Run Checkstyle 

To analyse this example using CheckStyle run 

```bash
mvn checkstyle:check
```


CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. You can change it to other styles like sun checkstyle. 







