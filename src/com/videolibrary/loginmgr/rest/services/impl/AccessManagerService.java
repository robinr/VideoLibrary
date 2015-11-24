package com.videolibrary.loginmgr.rest.services.impl;

import com.videolibrary.loginmgr.model.Subscriber;
import com.videolibrary.loginmgr.model.SubscriberRequest;
import com.videolibrary.loginmgr.model.SubscriberResponse;

import java.util.Arrays;
import java.lang.*;

import com.videolibrary.loginmgr.dao.LoginManagerDao;
import com.videolibrary.loginmgr.rest.services.AccessManager;

public class AccessManagerService implements AccessManager {
	
	LoginManagerDao logins;
	
	
	public LoginManagerDao getLogins() {
		return logins;
	}

	public void setLogins(LoginManagerDao logins) {
		this.logins = logins;
	}

	@Override
	public SubscriberResponse LoginById(SubscriberRequest request) {
		
		SubscriberResponse response = new SubscriberResponse();
		SubscriberRequest  larry =  new SubscriberRequest();
		Subscriber subscriber = new Subscriber();
		subscriber = getLogins().LoginById(request.getSubscriber());
		
		try
		{
			subscriber = getLogins().LoginById(request.getSubscriber());
			larry.setSubscriber(subscriber);
			response.setAllsubscribers(Arrays.asList(larry));
			response.setIsvalid(true);
			if(subscriber.getRole() == "admin")
			{
				response.setIsAdmin(true);
			}
			else
			{
				response.setIsAdmin(false);
			}
			response.setErrorMessage("success");
		}
		catch (Exception e)
		{
			response.setIsvalid(false);
			response.setIsAdmin(false);
			response.setErrorMessage(e.getClass() + ": " + e.getMessage());
		}

		return response;
	}

	@Override
	public SubscriberResponse LogOut(Integer id) {
		SubscriberResponse response = new SubscriberResponse();
		SubscriberRequest  larry =  new SubscriberRequest();
		Subscriber subscriber = new Subscriber();
		Boolean logout = false;
		System.out.println("Logout"+id);
		try
		{
			logout = getLogins().Logout(id);
			larry.setSubscriber(subscriber);
			response.setAllsubscribers(Arrays.asList(larry));
			response.setIsvalid(logout);
			response.setIsAdmin(false);
			response.setErrorMessage("success");
		}
		catch (Exception e)
		{
			logout = false;
			response.setIsvalid(logout);
			response.setIsAdmin(false);
			response.setErrorMessage(e.getClass() + ": " + e.getMessage());
		}
		return response;
	}

}
