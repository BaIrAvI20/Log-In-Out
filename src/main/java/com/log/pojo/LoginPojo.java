package com.log.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "details")
public class LoginPojo {
	@Id
	private String name;
	private String password;
	private String emailid;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public LoginPojo(String name, String password, String emailid) {
		super();
		this.name = name;
		this.password = password;
		this.emailid = emailid;
	}

	public LoginPojo() {
		super();
		// TODO Auto-generated constructor stub
	}

}
