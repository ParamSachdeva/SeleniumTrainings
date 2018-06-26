package IVPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int test =44;
		int count = 0;
		for (int t = 1; t <= test; t++)
		{
			for (int i =4; i<=t;i++)
			{
				if (t%i == 0)
				{
					count++;
					if(count == t)
					{
						System.out.println(t +" is Not Prime");	
						count = 0;
						break;
					}
				}
				else
				{
					count++;
					if(count == t)
					{
						System.out.println(t + " Prime");	
						count = 0;
						break;
					}
										
				}
			}
		}
	}

}
