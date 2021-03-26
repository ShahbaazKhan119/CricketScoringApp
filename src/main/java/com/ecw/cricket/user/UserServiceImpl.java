package com.ecw.cricket.user;

public class UserServiceImpl implements UserService{
	
	private UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}


	public void add(User user){
		userRepository.save(user);
	}
	
}
