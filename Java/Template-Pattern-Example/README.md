# Template Method. 

Definition: "defines the skeleton of an algorithm in a method, deferring some steps to subclasses. 
Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm’s structure."

This project is an example of the template method

# Application Scenario 

Think of how different systems process customer orders. Customers can order online or in store, 
they can select their specific type of payment to complete the transaction, and lastly choose the delivery option for their items. 
Each order goes through sequence of steps, where the sequence is the same for each order, but how each step is accomplished is different.

In this case, the template pattern allows us to define the same sequence structure for each type of customer order,
but also define how each step is different for the type of customer order within the sequence. 

This implementation reflects that as an abstract class of OrderProcessTemplate where it defines two methods handlePayment() and handleDelivery().
Each method is implemented in the respective subclassing. This allows us to implement different ways of processing orders. 

within the OrderProcessTemplate class there is a ProcessOrder() method (our template method) that executes the respective methods in 
sequence. When the sub classes call this method, they will use their unique implementation for each of the methods it overrides. For example, 
completing a order in store allows for the acceptance of cash, debit, or credit as a payment option (InStoreOrder class), but if the Order is from online, than it can only 
allow for debit or credit as a payment option (OnlineOrder class). 

# How to compile the project

We use Apache Maven to compile and run this project. 

You need to install Apache Maven (https://maven.apache.org/)  on your system. 

Type on the command line: 

```bash
mvn clean compile
```

# How to create a binary runnable package 


```bash
mvn clean compile assembly:single
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

To analyze this example using CheckStyle run 

```bash
mvn checkstyle:check
```


CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. 
You can change it to other styles like sun checkstyle. 
