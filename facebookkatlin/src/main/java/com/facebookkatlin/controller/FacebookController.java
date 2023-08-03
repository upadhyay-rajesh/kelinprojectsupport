package com.facebookkatlin.controller;

import java.util.Scanner;

import com.facebookkatlin.entity.FacebookUser;
import com.facebookkatlin.service.FacebookService;
import com.facebookkatlin.service.FacebookServiceInterface;

public class FacebookController implements FacebookControllerInterface {

	public void createProfile() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.next();
		
		System.out.println("enter password");
		String password=sc.next();
		
		System.out.println("enter email");
		String email=sc.next();
		
		System.out.println("enter address");
		String address=sc.next();
		
		FacebookUser fu=new FacebookUser();
		fu.setName(name);
		fu.setPassword(password);
		fu.setEmail(email);
		fu.setAddress(address);
		
		FacebookServiceInterface fs=new FacebookService();
		
		int i=fs.createProfileService(fu);
		
		if(i>0) {
			System.out.println("profile created");
		}
		else {
			System.out.println("could not create profile");
		}
		
		

	}

	public void viewProfile() {
		// TODO Auto-generated method stub

	}

	public void editProfile() {
		// TODO Auto-generated method stub

	}

	public void deleteProfile() {
		// TODO Auto-generated method stub

	}

	public void searchProfile() {
		// TODO Auto-generated method stub

	}

	public void viewAllProfile() {
		// TODO Auto-generated method stub

	}

}
