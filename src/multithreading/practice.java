package multithreading;
import java.util.Scanner;

public class practice {
	public static void main(String args[]) {
		int element;
		System.out.println("enter no. of elements for array : ");
		Scanner obj= new Scanner(System.in);
		element= obj.nextInt();
		int a[]= new int[element];
		System.out.println("enter elements : ");
		
		for(int i=0; i<a.length;i++) {
			a[i]=obj.nextInt();
		}
		int res= a[0];
		for(int i=0;i<a.length;i++) {
			if(res>a[i]) {
				res=a[i];
			}
		}
		System.out.println("smallest no. is : "+res);
		
	}
}
 