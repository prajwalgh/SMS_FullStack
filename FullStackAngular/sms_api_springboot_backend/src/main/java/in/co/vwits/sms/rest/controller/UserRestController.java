package in.co.vwits.sms.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.co.vwits.sms.model.Student;
import in.co.vwits.sms.model.User;
import in.co.vwits.sms.service.StudentService;
import in.co.vwits.sms.service.UserServices;

@RestController
@RequestMapping(value="/api/user")
public class UserRestController {
	@Autowired
    private UserServices service1;

	
	@PostMapping
	public User createNewStudent(@RequestBody User u) {
		return this.service1.save(u);
	}
	
	
	@GetMapping(value="/{id}")
	public User findById(@PathVariable int id) {
		return service1.findById(id).get();
	}

//	@GetMapping()
//	public User findAllById(@PathVariable int id) {
//		return service.getAllUsers(id).get();
//	}
	
}
