set projectLocation=D:\automation\Hiremee_Product_UAT__smoke_Testing_clone
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause