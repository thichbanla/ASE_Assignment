package com.ase;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String userName;
	private String password;
	
	public String getUserName()
	{
		return userName;
	}
	
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public String execute() throws Exception {
			return SUCCESS;
	}
	
	public void validate()
	{
		if (getPassword() == null) {
            addFieldError("password", getText("password.required"));
        }
		else if (!getPassword().equals("abcd"))
        {
        	addFieldError("password", "Wrong Password");
        }
		
		if (getUserName() == null) {			 
            addFieldError("userName", "UserName.required");
		 }
         else if (!getUserName().equals("abc")) {
            addFieldError("userName", "Invalid User");
        }
	}

}
