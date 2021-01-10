# Using Spring boot how to Reload properts values without restarting the application.
# Alredy running producation application you want make any changes - Like example DB password got changed and do need to updat this change in the appplication without down time 

	# Getting Started - Developer tools
	
	Developer tools are automatically disabled when running a fully packaged application. If your application is launched from java -jar or if it is started from a special classloader, then it is considered a “production application”. You can control this behavior by using the spring.devtools.restart.enabled system property. To enable devtools, irrespective of the classloader used to launch your application, set the -Dspring.devtools.restart.enabled=true system property. This must not be done in a production environment where running devtools is a security risk. To disable devtools, exclude the dependency or set the -Dspring.devtools.restart.enabled=false system property.
	
	Added dependency in pom.xml 
	=========================
	1. spring-boot-starter
	2. spring-boot-devtools
	   
	   Create SpringBootApplication class
	   Create variable in the boot class Or add properies and try to print that value on the console
	   
	   		String s ="Welcome ReloadPropertsApplication";
	   		
	   Start the server 
	   
	   	See the logs 
	   	=======
		Welcome ReloadPropertsApplication
		=======
	   
	   Modify the string value and save 
	   String s ="Hello ReloadPropertsApplication";
	
	Application will automatically application we restart. Modified string will print on the screen 
	
		=======
		Hello ReloadPropertsApplication
		=======
	
	
	If you want to create REST Api end point to test.  Added below dependence in pom.xml 
	  
	
	3. spring-boot-starter-web
	
	4. open your end point in the browse 
	
	http://localhost:9090/login
	
	LoginRestService.java 
	
	Change the return value and test gain refresh the browser. You see the changes.
	
	Save way we can modify any properties value 
	
This is usefull to make password changes without restaring  the application and without down time  
	
	

Production application
====================


	Developer tools are automatically disabled when running a fully packaged application. If your application is launched from java -jar or if it is started from a special classloader, then it is considered a “production application”. You can control this behavior by using the spring.devtools.restart.enabled system property. To enable devtools, irrespective of the classloader used to launch your application, set the -Dspring.devtools.restart.enabled=true system property. This must not be done in a production environment where running devtools is a security risk. To disable devtools, exclude the dependency or set the -Dspring.devtools.restart.enabled=false system property.

		
