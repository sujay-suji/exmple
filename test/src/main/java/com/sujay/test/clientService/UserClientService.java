package com.sujay.test.clientService;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sujay.test.model.User;
import com.sujay.test.propertyFile.MyProperty;

@Service
public class UserClientService {
	
	private static @Autowired MyProperty prop;
	
	public static User createUser(User user) throws URISyntaxException {
		System.out.println("12345");
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<User> entity = new HttpEntity<User>(user); 
		final String baseUrl = "http://localhost:8080/api/user/createUser";
		
	    URI uri = new URI(baseUrl);
	    System.out.println("*****URI ***"+baseUrl);
		User user2 = restTemplate.postForObject(uri,entity, User.class);
		System.out.println("CameBack");
		System.out.println(" ***\n\n\n\n "+user2.getName());
		/*
		 * final String baseUrl2 =prop.getApiUrl("/createUser");
		 * System.out.println("*****URI 2222222222222222222***"+baseUrl2);
		 */
		return user2;
	}
	
	public static void getMethod() throws URISyntaxException {
		System.out.println("***123");
		RestTemplate restTemplate = new RestTemplate();
		//HttpEntity<> entity = new HttpEntity<>(); 
		final String baseUrl = "http://localhost:8080/api/user/a";
	    URI uri = new URI(baseUrl);
	    System.out.println("*****URI ***"+baseUrl);
		//User user2 = restTemplate.postForObject(uri,, User.class);
		ResponseEntity<String> result = restTemplate.getForEntity(baseUrl, String.class);
		System.out.println("CameBack");
		System.out.println(" ***\n\n\n\n ");
		
	}

}
