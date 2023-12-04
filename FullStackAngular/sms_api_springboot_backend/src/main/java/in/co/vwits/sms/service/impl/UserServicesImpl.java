package in.co.vwits.sms.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.vwits.sms.model.User;
import in.co.vwits.sms.repository.UserRepository;
import in.co.vwits.sms.service.UserServices;

@Service
public class UserServicesImpl implements UserServices {
	@Autowired
	private UserRepository UserRepo;

	@Override
	public User save(User user) {
		return this.UserRepo.save(user);
	}

	@Override
	public Optional<User> findById(int id) {
		return this.UserRepo.findById(id);
		}
	
//
//	@Override
//	public List<User> getAllUsers(Long userId) {
//		return this.UserRepo.findAll();
//	}



	
}
