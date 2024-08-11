The code converts time to British spoken form.
The code is built using java17.


**How to run?**
mvn clean install -DskipTests

java -jar <pathToLocalm2Repository>/SmartBearAssignment-1.0-SNAPSHOT.jar

Example:
bnathani@BNATHANI-M-22ME 1.0-SNAPSHOT % java -jar SmartBearAssignment-1.0-SNAPSHOT.jar

Entire British time:
12:00
2024-08-11 18:44:29 INFO  o.smartbear.app.BritishSpokenTimeApp - The entered British time is 12:00
2024-08-11 18:44:29 INFO  o.smartbear.app.BritishSpokenTimeApp - The spoken form of british time 12:00 is: noon

bnathani@BNATHANI-M-22ME 1.0-SNAPSHOT %  



**Run all tests:**
mvn clean install 
