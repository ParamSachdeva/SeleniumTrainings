package JavaL;


abstract class print {
	void  h1(){
		System.out.println("h1");
	}
	abstract void h2();
}


public class AbstractClassL extends print {

	public static void main(String[] args) {

		AbstractClassL ac = new AbstractClassL();
		ac.h1();
		ac.h2();
		
		//abstarct class object via class

		print xyz = new AbstractClassL();
		xyz.h1();
		xyz.h2();
		
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