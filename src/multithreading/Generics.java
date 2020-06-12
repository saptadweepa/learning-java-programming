package multithreading;

public class Generics {
	
	public static void main(String args[]) {
		Number obj1= new Number();
		Alphabet obj2= new Alphabet();
		PointNumber obj3= new PointNumber();
		
		
		obj1.setter(5);
		
		System.out.println(obj1.getter());
		
		obj2.setter("Generics");
		
		System.out.println(obj2.getter());
		
		obj3.setter(1.5);
		
		System.out.println(obj3.getter());
		
		GetNSet<Integer> number= new GetNSet<>();
		
		GetNSet<String> alphabet= new GetNSet<>();
		
		GetNSet<Double> pointnumber= new GetNSet<>();
		
		number.setVar1(5);
		alphabet.setVar1("Generics");
		pointnumber.setVar1(1.5);
		
		
		GetNSet<Number> genNum= new GetNSet<>(); //Defined custom type generic object
		
		//Now the Generic Object is created, i need to initialize it
		
		Number n = new Number();
		genNum.setVar1(n);
		
		//Now  n is an object inside genNum, n can take integer values, I will initialize 
		// the "n" which is inside genNum
		
		Number n2 = genNum.getVar1();
		n2.setter(4);
		genNum.setVar1(n2);
		//genNum.getVar1().setter(4); //after getting n, i initialized the value inside it with 4
		//      ^
		//      |
		//     This will give me n
		
		System.out.println("from generics : " +number.getVar1());
		System.out.println("from generics : " +alphabet.getVar1());
		System.out.println("from generics : " +pointnumber.getVar1());
		
	}

}

class Number{
	Integer i;
	Integer j;
	public void setter(Integer i) {
		this.i= i;
		
	}
	
	
	
	public Integer getter() {
		return i;
	}
	
}

class Alphabet{
	String str;
	public void setter(String str) {
		this.str= str;
		
	}
	
	public String getter() {
		return str;
	}
}

class PointNumber{
	Double d;
	public void setter(Double d) {
		this.d= d;
		
	}
	
	public Double getter() {
		return d;
	}
	
}


class GetNSet<T>{
	T var1;
	public void setVar1(T var1) {
		this.var1=var1;
		
	}
	
	public T getVar1(){
		return var1;
		
	}
	
	
}


