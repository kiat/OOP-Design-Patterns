# Factory Method Pattern Example

This project is an example of Factory Method Pattern in Java. 


# Application Scenario 

In Banks we have different kind of bank accounts. For example we have Checking accounts and Saving accounts. 
When these accounts should be created different background processes in the bank finance system is triggered. 
For example different kind of data are added to different databases of the bank or different brokers are informed about 
creation of the new account. 

These sub-processes can be different based on the type of the Bank Accounts (Checking and Saving accounts). 

When a customer comes to the bank and asks for a checking account, we want to provide a simple method that he can call and say 
"Checking" or "Saving" accounts are need without the need to know about the internal processes of the bank. 



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