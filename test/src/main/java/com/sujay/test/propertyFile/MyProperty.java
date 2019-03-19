package com.sujay.test.propertyFile;

import org.springframework.stereotype.Component;

@Component
public class MyProperty {
	
	private String apiUrl="http://localhost:8080/api/user";

	public String getApiUrl(String url) {
		System.out.println("UURRRRRLLLLLLL");
		return apiUrl+url;
	}

	public void setApiUrl(String apiUrl) {
		this.apiUrl = "http://localhost:8080/api/user";
	}

	
}
