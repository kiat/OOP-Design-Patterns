# Example 1 - Software Design and Patterns

This is an example of object-oriented programming.  
This example illustrates OOP basic concepts of abstraction, encapsulation, inheritance and polymorphism. 
This example is a basic illustration of strategy design pattern. 


# Basic Idea and Concepts 

**Means of transportations** can be:  

+ **Car** like Economy Car, SUVs, Trucks
+ **Airplane** like Passenger Plane, Jets
+ **Ship** like Container Ship, Passenger ships, boats, fast boats
+ **Trains** like fast Trains

These means of transportations have different brake behaviors,  

**Brake Behaviors** can be:

+ **Simple Brake** Simple brake, can be hand brakes 
+ **Brake with ABS** Car brakes with Anti Block System (ABS)
+ **Hydraulic Brake** Hydraulic Brakes for Cars and trains
+ **Reverse Engines** Jet planes use this kind of brakes 
+ **Brake Parachute** A parachute attached to the rear of a plane and opened to assist braking. 
+ **Push To Other Direction** Ships can brake by pushing to the other directions
+ **Turn of the engines** For example, fast boats can brake by turning off the engines. 

 

  





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







