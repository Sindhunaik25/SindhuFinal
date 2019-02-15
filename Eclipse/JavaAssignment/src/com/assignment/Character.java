package com.assignment;

import java.util.*;

public class Character {
	public void userValidation() {
		Scanner sc = new Scanner(System.in);
		String name, password;
		String uname = "Sindhu";
		String pword = "naik100";
		int count = 0;
		System.out.println("Enter your name");
		name = sc.next();
		System.out.println("Enter your password");
		password = sc.next();
		if ((name.equals(uname)) && (password.equals(pword))) {
			System.out.println("Welcome");
		} else {
			while (count < 2) {
				if (!((name.equals(name)) && (password.equals(pword)))) {
					System.out.println("Enter name");
					name = sc.next();
					System.out.println("Enter your password");
					password = sc.next();
				}
				count = count + 1;
			}

		}
		if (count == 2) {
			System.out.println("Contact");
		}

	}

	public static void main(String[] args) {
		Character character = new Character();
		character.userValidation();
	}
}
