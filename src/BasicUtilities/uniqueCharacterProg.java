package BasicUtilities;

import java.util.HashMap;
import java.util.Scanner;


public class uniqueCharacterProg {

	private static Scanner ui;

	public static void main(String[] args) {

		ui = new Scanner(System.in);
		String testip = ui.nextLine();

		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();

		Character c;
		for(int i=0; i< testip.length(); i++){

			c = testip.charAt(i);

			if (hm.containsKey(c))
			{
				hm.put(c, hm.get(c)+1);
			}
			else
			{
				hm.put(c, 1);
			}			
		}

		for(int i=0; i< testip.length(); i++){
			c = testip.charAt(i);
			if (hm.get(c) == 1)
			{
				System.out.print(c); 
			}
		}
	}
}