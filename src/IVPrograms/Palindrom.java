package IVPrograms;

import java.util.Arrays;

public class Palindrom {

	public static void main(String[] args) {

		String test = "nitain";
		String[] splittest = test.trim().toLowerCase().split("");
		String[] revtest = new String[splittest.length];
		for (int i = 0; i< splittest.length; i++){
			revtest[i] = splittest[splittest.length-1-i];
		}

		if (Arrays.equals(revtest, splittest))
		{
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("Not Palindrom");
		}
	}
}
