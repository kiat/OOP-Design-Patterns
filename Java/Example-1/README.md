# Software-Design-Patterns


# How to compile

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
java -cp target/*.jar edu.bu.met.cs665.Main
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
