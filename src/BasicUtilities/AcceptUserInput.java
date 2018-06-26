package BasicUtilities;

import java.util.Scanner;

import javax.swing.JOptionPane;


public class AcceptUserInput {

	private static Scanner in;

	public static void main(String[] args) {
		// User Input Via Console
		
		int a;
		float b;
		String s;

		in = new Scanner(System.in);

		System.out.println("Enter a string");
		s = in.nextLine();
		System.out.println("You entered string "+s);

		System.out.println("Enter an integer");
		a = in.nextInt();
		System.out.println("You entered integer "+a);

		System.out.println("Enter a float");
		b = in.nextFloat();
		System.out.println("You entered float "+b);   
		
		
		//User Input via InputBox
		
		String test1;
		
		int test2;
		float test3;
		
		

		test1= JOptionPane.showInputDialog("Please input String: ");
		test2= Integer.parseInt(JOptionPane.showInputDialog("Please input Integer: "));
		test3= Float.parseFloat(JOptionPane.showInputDialog("Please input Float: "));
		
		System.out.println("You entered integer "+test1);
		System.out.println("You entered integer "+test2);
		System.out.println("You entered integer "+test3);
		
		
		JOptionPane.showMessageDialog(null,test1);
		
		
	}

}
