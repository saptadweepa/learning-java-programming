package multithreading;

public class IfElseClass {
	
	static final String YES= "YES";    // with the help of static keyword we make variables, methods, constants etc static.
	static final String NO= "NO";
	static final String MAYBE= "MAYBE";
	
	public static void main(String args[]) {
		
		int a=12;
		int b=3;
		int c= 999;
		int d= 3000;
		int e= 4000;
		
		method1(a);
		method1(b);
		inRange(c);
		inRange(d);
		switchMethod(c);
		switchMethod(a);
		switchMethod(b);
		switchMethod(d);
		switchMethod(e);
 		methodFor(10);
		
	}
	
	public static void method1(int a) {
		
		/**write code such that if a is less than 10 output should be 
		 * "the value is less than 10" and if greater than 10 out put should be "greater than 10"
		 * if value is even output should be in  a new line "value is even" and if value is odd 
		 * output should be "value is odd"
		 */
		
		System.out.println("when the value is "+a);
		
		if (a<10) {
			System.out.println("the value is less than 10");
			}
		else {
			System.out.println("greater than 10");
		}
			
		if(a%2==0) {
			System.out.println("value is even");
		}
		else {
			System.out.println("value is odd");
		}
	}
	
	public static String inRange(int a) {
		
		if(a>=0 && a<=99) {
			return YES;
		}
		
		else if(a>=100 && a<=999) {
			return NO;
		}
		else {               //we don't use condition after else
		return MAYBE;
		}
	}
	
	public static void switchMethod(int num) {
		
	String result= inRange(num)	;
	if(num>3000) {
		 result= "Something";
	}
	
	switch (result) {
	case YES:
		System.out.println("inRange 0-99");
		break;
	case NO:
		System.out.println("inRange 100-999");
		break;
	case MAYBE:
		System.out.println("inRange 1000-3000");
		break;	
		
	default:
		System.out.println("nothing");
		
	}
		
	}
	
	public static void methodFor(int num) {
		int i;
		for(i=num; i<num+10; i++) {
			System.out.println(i);
		}
		methodWhile(i);
	}
	
	public static void methodWhile(int num) {
		
		int i=num;
		while(i<num+10) {
			System.out.println(i);
			i++;
	    }
		methodDoWhile(i);
	}
	
	public static void methodDoWhile(int num) {
		int i= num;
		do {
			
			System.out.println(i);
			i++;
		}while(i<num+10);
	}

}
