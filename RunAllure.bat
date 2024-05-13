set ProjectPath=%~dp0
cd %ProjectPath%
echo %ProjectPath% 
set p=%PATH%
java -javaagent:"%ProjectPath%libAllureReport\aspectjweaver-1.9.8.jar" -classpath "%ProjectPath%bin;%ProjectPath%libAllureReport\*;%ProjectPath%libAllureReport\*;%ProjectPath%libLog4j\*;%ProjectPath%libSelenium\*;%ProjectPath%libReportNG\*" org.testng.TestNG "%ProjectPath%bin\runBlueCloakTest.xml"
pause