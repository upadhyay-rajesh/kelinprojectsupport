package com.facebookkatlin.view;

import java.util.Scanner;

import com.facebookkatlin.controller.FacebookController;
import com.facebookkatlin.controller.FacebookControllerInterface;

public class FacebookView {

	public static void main(String[] args) {
		System.out.println("****************MAIN MENU************");
		System.out.println("press 1 to create profile");
		System.out.println("press 2 to view profile");
		System.out.println("press 3 to edit profile");
		System.out.println("press 4 to delete profile");
		System.out.println("press 5 to search profile");
		System.out.println("press 6 to view all profile");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice");
		int choice=sc.nextInt();
		
		FacebookControllerInterface fc=new FacebookController();
		
		switch(choice) {
		case 1: fc.createProfile();
			break;
		case 2: fc.viewProfile();
			break;
		case 3: fc.editProfile();
			break;
		case 4: fc.deleteProfile();
			break;
		case 5: fc.searchProfile();
			break;
		case 6: fc.viewAllProfile();
			break;
			default: System.out.println("wrong choice");
		}

	}

}
