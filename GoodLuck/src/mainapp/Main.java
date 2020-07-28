package mainapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException,IOException, ClassNotFoundException, SQLException {
		System.out.println("Register Here");
		System.out.println("Login");
		int x;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		x=Integer.parseInt(br.readLine());
		RegisterPojo registerpojo= new RegisterPojo();
		RegisterDAO registerdao= new RegisterDAO();
		Scanner sc= new Scanner(System.in);
		LoginPojo loginpojo = new LoginPojo();
		LoginDAO logindao = new LoginDAO();
		switch(x)
		{
		case 1:
			System.out.println("Enter your First Name: ");
			String firstName = br.readLine();
			System.out.println("Enter your Last Name: ");
			String lastName = br.readLine();
			System.out.println("Enter Username: ");
			String username = br.readLine();
			System.out.println("Enter your Password: ");
			String password = br.readLine();
			System.out.println("Enter your Email: ");
			String email = br.readLine();
			registerpojo.setFirstName(firstName);
			registerpojo.setLastName(lastName);
			registerpojo.setUserName(username);
			registerpojo.setPassword(password);
			registerpojo.setEmail(email);
			
			registerdao.addUser(registerpojo);
			
			break;
		case 2:
			System.out.println("Enter Username: ");
			String name = br.readLine();
			System.out.println("Enter your Password: ");
			String pass = br.readLine();
			loginpojo.setUsername(name);
			loginpojo.setPassword(pass);
			if(logindao.validate(loginpojo)==true)
			{
				Luck luck = new Luck();
				luck.display();
			}
			else
			{
				System.out.println("Invalid Username and Password");
			}
			
			
			
			break;
		}

	}

}
