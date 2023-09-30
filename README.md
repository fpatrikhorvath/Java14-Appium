<h1>Appium Tutorial Project</h1>

It's not possible to test IOS/IPhone applications on windows.

This projected is based on this video series: 
https://www.youtube.com/watch?v=bRuzJi1ekXE&list=PLBNb67lT6eELiDgH97xpdJeKM624Zm7li

Source of the tested mobile application: https://github.com/webdriverio/native-demo-app

If You would like to run it, just use this command:
```
mvn clean test -D"cucumber.filter.tags=@smoke"
```

Core technologies:
```
Java 14 & Maven
Junit4
Android 29 emulator
Appium/Selenium
RestAssured
```