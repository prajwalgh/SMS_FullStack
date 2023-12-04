package in.co.vwits.sms.service;

import java.util.Optional;

//import java.util.List;

import in.co.vwits.sms.model.User;

public interface UserServices {
 User save(User user);
 Optional<User> findById(int id);
 //User getUserByName
 //List<User> getAllUsers(Long userId);


}

