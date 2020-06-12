package multithreading;

public class Generics2 {
	public static void main(String args[]) {
		Integer a[]=new Integer[10];
		
		//use genarr with Integer and String
		
		
		GenArr<Integer> num= new GenArr<>();
		GenArr<String> str= new GenArr<>();
		
		
		
		for(Integer i=0; i<10; i++) {
			a[i]= i+1;
		}
		
		//String str1[]= new String[10];
		
		String str1[]= {"aa","bb","c","d","e"};
		
		num.setA(a);
		
		System.out.println(num.ReturnIndex(3));
		
		str.setA(str1);
		System.out.println(str.ReturnIndex(3));
		System.out.println(str.ReturnIndex(11)); // do the exception handling here
		
		/**
		 * Home work 
		 * Write some code to prevent the exception with message
		 * that requested index is not present in the array.   
		 */
	}
	

}

class GenArr<T>{
	T a[]; // declaration of array of type T
	
	public void setA(T a[]) { // [] is needed
		this.a= a;
		
	}
	
	public T[] getA() {
		return a;
	}
	
	//write a method which will take an integer as input and return value from array at that index
	
	
	public T ReturnIndex(int index) {
		if(index < a.length)
			return a[index];
		else {
			System.out.println("that requested index is not present in the array");
			return null;
		}
			
		}
	}
	


