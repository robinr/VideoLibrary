package com.videolibrary.loginmgr.dao;

import com.videolibrary.loginmgr.model.Subscriber;

public interface LoginManagerDao {
	
	   public Subscriber LoginById(Subscriber subscriber);
	   
	   public Boolean Logout(Integer id);

}
