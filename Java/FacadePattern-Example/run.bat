call mvn clean compile
call mvn exec:java -D"exec.executable"="edu.bu.met.cs665.Main" -D"log4j.configuration"="file:log4j.properties"

