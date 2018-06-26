package BasicJavaSessions;

import javax.swing.JOptionPane;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String username = args[0]; //=="one"
		String password = args[1];
		
		System.out.println("Run Time Provided:  " + username); 
		System.out.println("Run Time Muliple is :  " + password);
		/*Scanner scanner = new Scanner(System.in);
		String username = scanner.nextLine();
		System.out.println("Your username is Via Scanner:  " + username);
		 */
		/*
		String username= JOptionPane.showInputDialog ("Please input mark for test 1: ");
		System.out.println("Your username is Via JoptionPane: " + username);
		*/
	}

}
