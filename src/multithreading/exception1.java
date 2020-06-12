package multithreading;

class Myexception extends Exception{
	
	Myexception(String str){
	super(str);	
	}
	
}


public class exception1 { 
	static void throwOne()throws Myexception {
		System.out.println("Inside throwOne.");
		throw new Myexception("own exception");
		}
		public static void main(String args[]) {
		try {
		throwOne();
		} catch (Myexception e) {
		System.out.println("Caught " + e);
		}
		}
}
