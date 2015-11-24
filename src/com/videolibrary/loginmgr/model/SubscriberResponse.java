package com.videolibrary.loginmgr.model;

import java.util.List;


public class SubscriberResponse {
	
	public List<SubscriberRequest>  allsubscribers;
	public Boolean isvalid;
	public Boolean isAdmin;
	public String errorMessage;
	
	
	public Boolean getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	public List<SubscriberRequest> getAllsubscribers() {
		return allsubscribers;
	}
	public void setAllsubscribers(List<SubscriberRequest> allsubscribers) {
		this.allsubscribers = allsubscribers;
	}
	public Boolean getIsvalid() {
		return isvalid;
	}
	public void setIsvalid(Boolean isvalid) {
		this.isvalid = isvalid;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	

}
