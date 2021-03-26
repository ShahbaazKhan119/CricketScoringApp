package com.ecw.cricket.user;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {

	private Map<Integer,User> users = new HashMap();
	
	public void save(User user){
		users.put(user.getUserId(), user);
	}

}
