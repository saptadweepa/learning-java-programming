package multithreading;

public class Arrays {
	/**
	 * q.1 write a method the first will take a starting no. x and initialize an array till 
	 *     x+10 and return that array.
	 * q.2  write a method that will take an integer array as input and print and return the sum of the array. 
	 * q.3 write the logic of method1 using while loop.
	 */
	public static void main(String args[]) {
		int res[]= method3(10);
		
		System.out.println(method2(res));
		}
	
	
	public static int[] method1(int num){
		int a[]= new int [11];
		for(int i=0; i<a.length; i++) {
			a[i]= num ;
			num++;
			}
		return a;
	}
	
	public static int method2(int num[]) {
		int sum=0;
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
			sum= sum+ num[i];
		}
		
		return sum;
	}
	
	public static int[] method3(int a) {
		int arr[]= new int[11];
		int i=0;
		while(i<arr.length) {
			arr[i]=a;
			a++;
			i++;
		}
		return arr;
		
	}
}
