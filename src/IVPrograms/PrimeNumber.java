package IVPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int number = 1;number <101;number++)
		{
			int test = number;
			int flag = 0;

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
							//System.out.println(t +" is Not Prime");	
							flag = 0;
							break;
						}
					}
					else
					{
						flag = 1;
						count++;
						if(count == t)
						{
							//System.out.println(t + " Prime");	
							count = 0;
							break;
						}

					}
					
					
				}
				
			}
			if (flag ==1)
			{
				System.out.println(test + "is Prime");
				flag=0;
			}
		}

	}
}
