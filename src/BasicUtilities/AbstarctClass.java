package BasicUtilities;

abstract class print {
	void  h1(){
		System.out.println("h1");
	}
	abstract void h2();
}


public class AbstarctClass extends print {

	public static void main(String[] args) {

		AbstarctClass ac = new AbstarctClass();
		ac.h1();
		ac.h2();
		
		//abstarct class object via class

		/*print xyz = new AbstarctClass();
		xyz.h1();
		xyz.h2();*/
		
	}

	@Override
	void h2() {
		System.out.println("h2");

	}

	@Override
	void h1() {
		System.out.println("h1 overrided");

	}
/*
	@Override
	void h2() {
		// TODO Auto-generated method stub
		
	}
*/	

}