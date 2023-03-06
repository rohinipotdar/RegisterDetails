package com.BikkadIT.RegistrationFormDemo.model;


public class UserDemo {
	
	private String uname;
	
	private String lname;
	
	private String username;
	
	private String email;
	
	private String password;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserDemo [uname=" + uname + ", lname=" + lname + ", username=" + username + ", email=" + email
				+ ", password=" + password + "]";
	}

}
