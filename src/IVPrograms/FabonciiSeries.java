package IVPrograms;

public class FabonciiSeries {

	public static void main(String[] args) {
		// 0 1 1 2 3 5 8 13
		int size = 8,temp,temp1 = 1,temp2=2;
		System.out.print("0 1 1");
		for(int i=0; i <=size-3;i++)
		{
			temp = temp1;
			temp1 = temp2;
			temp2 = temp1+temp;
			System.out.print(" "+ temp1);
		}

	}

}
