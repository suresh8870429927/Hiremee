set projectLocation=D:\Automation_directory\Hiremee_Product_Sanity_Testing
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\Hiremee_company_module.xml
pause