package com.videolibrary.loginmgr.dao.impl;

import java.util.ArrayList;
import java.util.List;


import com.videolibrary.loginmgr.dao.LoginManagerDao;
import com.videolibrary.loginmgr.model.Subscriber;

public class LoginManagerMemoryDao implements LoginManagerDao {
	
	private int nextUserId = 0;
	
	List<Subscriber> Subscribers = new ArrayList<Subscriber>();

	public LoginManagerMemoryDao()
	{
		Subscriber user1,user2,user3,user4,user5;
		
		user1 = new Subscriber();
		user1.setLoginID("sales@infowareconsultants.com");  
		user1.setName("Sales");
		user1.setPassword("sales123");
		user1.setRole("admin");
		user1.setId(nextUserId++);
		
		user2 = new Subscriber();
		user2.setLoginID("raghu@infowareconsultants.com");  
		user2.setName("Raghu");
		user2.setPassword("test");
		user2.setRole("user");
		user2.setId(nextUserId++);
		
		user3 = new Subscriber();
		user3.setLoginID("vivek@infowareconsultants.com");  
		user3.setName("Vivek");
		user3.setPassword("test");
		user3.setRole("user");
		user3.setId(nextUserId++);
		
		user4 = new Subscriber();
		user4.setLoginID("nagendrappa@infowareconsultants.com");  
		user4.setName("Nagendrappa");
		user4.setPassword("test");
		user4.setRole("user");
		user4.setId(nextUserId++);
		
		user5 = new Subscriber();
		user5.setLoginID("santhosh@infowareconsultants.com");  
		user5.setName("Santhosh");
		user5.setPassword("test");
		user5.setRole("user");
		user5.setId(nextUserId++);
		
		Subscribers.add(user1);
		Subscribers.add(user2);
		Subscribers.add(user3);
		Subscribers.add(user4);
		Subscribers.add(user5);
	}
	
	public Subscriber LoginById(Subscriber subscriber) {
		
		String loginID = subscriber.getLoginID();
		String Passwd  = subscriber.getPassword();
		
		
		for (Subscriber user : Subscribers)
		{
			if ((user.getLoginID().equals(loginID)) && (user.getPassword().equals(Passwd)))
			{
				return user;
			}
		}
		return null;
	}


	public Boolean Logout(Integer id) {
		
		for (Subscriber user : Subscribers)
		{
			if(user.getId() == id)
			{
				return true;
			}
		}
		return false;
	}

}
