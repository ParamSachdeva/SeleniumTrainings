package BasicUtilities;

import java.util.Scanner;

public class AnonymousObject {

	private static Scanner scan;

	void fact(int n){
		int fact = 1;
		for (int i = 1; i<n ; i++){
			fact = fact * i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		AnonymousObject obj = new AnonymousObject();
		scan = new Scanner(System.in); // Or can be Scanner scan = new Scanner();
		int num = scan.nextInt();
		obj.fact(num);
	}
}
