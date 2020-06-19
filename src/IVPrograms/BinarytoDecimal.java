package JavaPrograms;
import java.util.Scanner;

public class BinarytoDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int bi = in.nextInt();
		int index = 0 , temp, de = 0 ;

		while (bi/10 != 0 || bi ==10)
		{
			if(bi == 10)
			{
				temp = 1;
				index ++;
				de = de + temp * (Powerof(2,index));
				bi = bi/10;
				break;
			}
			else
			{
				temp = bi%10;
				bi = bi/10;
				de = de + temp * (Powerof(2,index));
				index ++;
			}
		}
		System.out.println(de);
	}

	static int Powerof(int base, int exponent)
	{
		int result = 1;

		while (exponent != 0)
		{
			result *= base;
			--exponent;
		}
		//System.out.println("Answer = " + result);
		return result;
	}

}
