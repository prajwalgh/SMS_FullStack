package in.co.vwits.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class HelloController {
	@RequestMapping("/hi")//hi us uri
	public String Welcome() {
		System.out.println("welcome");
		return "home"; //this string is view that we are returning from server to client client
		//generally this is view in jsp file but with rising popularity of client -side framework angular and react
		// this way of building web application is declining day by day, instead
		//rest web services are build on server side. and they are consumed by clied side applicatio sucn as react,angular.
	}
	
	@ResponseBody
	@RequestMapping("/welcome")
	public String sayHello() {
		return "Hello"; // this string must be return as data 
	}

}
