# Model View Controller

MVC separates the application logic into 3 layers, models, views, and controllers.
models represent how your data is structured throughout your application. Views represent the actual presentation of your models 
on the client side. Controller is the bridge that allows models and views to work with one another while separating their logic. 

In the first example, we have a Product (model), ProductController (controller), and ProductPrintOut (views). 
The main action is in the ProductController class, where it is connecting the models to the views. 

In the web example (More realistic use case for MVC), we have our Teacher model, our TeacherServletController, 
and an actual web page (teacher-record.jsp). The controller sends a list of teacher models as an HTTP request to the web page 
and all the web page does is display that data. The advantages of MVC include, separating the presentation layer from the business layer,
the controller is responsible for invoking the model and sending that model to the view, and the model is modular, 
you can use it in an web, mobile, or desktop application.




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

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. 
You can change it to other styles like sun checkstyle. 

To analyze this example using CheckStyle run 

```bash
mvn checkstyle:check
```

This will generate a report in XML format


```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser. 

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```
