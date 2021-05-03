package com.log.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.log.Repository.Details;
import com.log.pojo.LoginPojo;

@Service
public class LoginService {
	
	@Autowired
	private Details det;

	public void SaveDetails(LoginPojo data) {
		det.save(data);
	}

	public boolean Login_check(LoginPojo data) {
		if(det.existsById(data.getName())) {
			if(det.findById(data.getName()).get().getPassword().equals(data.getPassword())) {
				return true;
			}
		}
		return false;
	}

	public boolean Existence(LoginPojo data) {
		if(det.existsById(data.getName())) {
			return true;
		}
		return false;
	}
	
	public String DisplayName(String name){
		System.out.println("hi");
		return det.findById(name).get().getName();	
	}

	
}
