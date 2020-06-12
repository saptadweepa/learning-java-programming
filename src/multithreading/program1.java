package multithreading;

import java.io.FileNotFoundException;

public class program1 {

	public static void main(String args[]) {
		try {
			func();
			System.exit(0);
			return;
		} catch (Error e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}finally {
			System.out.println("This will be alwys executed");
		}
	}
	
	static void func(){
		
		System.out.println("hello");
		//func();	
		//try , catch, throw, throws, finally
	}

}
