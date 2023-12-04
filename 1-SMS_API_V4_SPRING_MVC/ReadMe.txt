HTTP: HyperText Transfer Protocol
Url is uniform resource locator, helps to identify resource uniquely on web.
url consists of following thing:
	protocol://
	DNS: domain name system
	OR 
	protocol://ipaddress:portno/contextroot/resource
example:
	http://localhost:8080/1-Sprint-Mvc-Demo/hi
	id client want to talk to server the he must know 2 thing:
		1. url
		2. https method (Get,Post,Delete,Put)
		Typing the url in the browser is always considerd as http get method.
		To access or to invode other http method we need special software which is know as rest client .
		One of the most populer rest client is Postman
To execute  any web application we need web container
for executing java based web application one og the most popular web conatiner is tomcat.	
Note: which version of web container to be used depende on which version of language and the
framework we are using.


version mismatch may lead to compatibility issues. 
	
=====================Spring Web MVC AND Spring Rest ===================================
	-so far we have been writing standalone application using spring.
	-The beauty of spring framework is it allows you to build 
	-different type of application like web apps, rest end point ,etc.
	-For all this different applications sprint gives you different module 
	-writing web application is very common requirement these days.
	-To wire web application spring has a module known as spring web mvc .
	-Spring WEB MVC is internally based on java servlate api.

------------------------------------------------------------------------
Following are the step to use web MVC.
	Step 1: Add appropriate dependencies in pom.xml
	Step 2: create a configuration class  and annotate this class with @EnableWebMvc
	Step 3: create webconfig class which is extended from  	AbstractAnnotationConfigDispatcherServletInitializer
	Step 4: Overwrite method
	Step 5: Write controller class annotation this class with @Controller
	Step 6:
	
	
[4:07 PM] Verma, Harsh (VWITS India I-GP-L/1)
Steps we have followed to deploy any application:
 
1. Download appropriate JDK

2. Download appropriate Spring Version

3. Download appropriate hibernate version(make sure that hibernate

and Spring version we are using are compatible with each other)

4. Download appropriate Tomcat version (make sure that tomcat version,

jdk version, framework version are compatible with each other. 

5. Write configuration files in Spring. 

6. Start tomcat and deploy applications on tomcat.

 Spring has over a period of time and offers a lot of feature.
 to use this feature we need to write lot of configurtion.
 This can be overwelming  for the beginnier and repetative for beginner for expernce.
 hence spring team has come up with new project known as spring boot.
 	1. spring boot gives us lot of configuration.
 	2. spring boot gives us opinionated starter pom.xml (hence we dont have to vary about version)
 	3. embedded container (no need to separately download tomcat and run it)
 	4. spring boot can guve us production radys application 
 	5. it save lot of developemnt time.
 	 