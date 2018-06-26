package IVPrograms;

public class BinarytoDecimal {

	public static void main(String[] args) {
		int test = 101;
		int temp,decimal = 0,index = 0; 
		while(test%10 != 0)
		{			
			temp = test%10;
			test = test/10;
			decimal = decimal + (temp * (2^index));
			index++;
		}
		System.out.println("Decimal is: " + test);
	}

}
