package IVPrograms;

public class Armstrong {

	public static void main(String[] args) {
		int test = 121,change=0,temp;
		int orignal = test;
		while(test%10 != 0)
		{
			temp = test%10;
			change = change + (temp*temp*temp);
			test = test/10;				
		}
		
		if (change==orignal)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
	}

}
