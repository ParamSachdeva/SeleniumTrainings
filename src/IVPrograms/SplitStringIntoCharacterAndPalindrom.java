package IVPrograms;

import java.util.Arrays;

public class SplitStringIntoCharacterAndPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//String input = "nitin";
		String input = "nitinaa";
		String[] arr = input.toLowerCase().trim().split("");
		int size = arr.length;
		String[] revarr = new String[size];
		for (int i=0;i<arr.length;i++)
		{
			revarr[i] = arr[size-1-i];			
			//System.out.println(arr[i].toString());
			//System.out.println(revarr[i].toString());
		}
		
		if (Arrays.equals(revarr,arr))
		
		{
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("Not Palindrom");	
		}

	}

}
