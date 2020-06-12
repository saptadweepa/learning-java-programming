package multithreading;



public class MultiDArray {
	
	/** 
	 * q.1 	write a method to declare a multidimensional array of row=3 and column=3 & initialize that array from 0,1....
	 * 		do above in a separate method which will accept row and column as parameter and return the multidimensional array
	 * q.2  write a method to print multidimensional array , it will take multiDimensionalarray as parameter.
	 * 
	 * q.3	write a method to create and return triangular array. it will take row and column as parameter.
	 * 
	 * H.W. write a method to create a multiDimentional array with below condition :
	 * 		1. for odd rows(1 ,3 , ....) the length of the row will be 5 and value of each column will be 3, 6, 9, 12, ....
	 * 		2. for even no. of rows (0, 2, 4,...) the length of the row will be 8 and the values of each column will be 2,4,6,8.....
	 * 
	 * 		for eg : for a given row = 6 the o/p of the multidimensional array will be:
	 * 				2 4 6 8 10 12 16 18
	 * 				3 6 9 12 15
	 * 				20 22 24 26 28 30 32 34
	 * 				18 21 24 27 30 
	 * 				36 38 40 42 44 46 48 50
	 * 				33 36 39 42 45 
	 * 
	 */
	
	
	
	
	public static void main(String args[]) {
		int res1[][]=createMultiDArray(3,3);
		printmultiDArray(res1);
		int res2[][]=triangleArray(4,3) ;
		printmultiDArray(res2);
		int res3[][]= customMultiDArray(6);
		printmultiDArray(res3);
	
	}
	
	public static int[][] createMultiDArray(int r, int c){    // with for loop
		int arr[][]= new int[r][c];
		int k=0;
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				arr[i][j]=k;
				k++;
			}
		}
		return arr;
	}
	
	
	public static int[][]createMultiDArray2(int r, int c){     //with while loop
		int a[][]= new int[r][c];
		int k=0;
		int i=0;
		
		while(i<r) {
			int j=0;
			while(j<c) {
				a[i][j]=k;
				k++;
				j++;
			}
			i++;
			
		}
		return a;
	}
	
	
	public static void printmultiDArray(int a[][]) {
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length;j++) {
				System.out.print("  "+a[i][j]);
			}
			System.out.println();
		}
	}
	
	public static int[][]triangleArray(int r, int c){
		int array[][]= new int[r][];
		int k=0;
		for(int i=0;i<r; i++) {
			array[i]= new int[i+1];
			for(int j=0; j<array[i].length; j++) {  
				
				array[i][j]=k;
				k++;
			}
		}
		return array;
	}
	
	public static int[][] customMultiDArray(int r){
		int a[][]= new int[r][];
		int k=3, p=2;
		for(int i=0; i<r; i++) {
			if(i%2==0) {
			a[i]=new int[8];
				for(int j=0; j<a[i].length; j++) {
				a[i][j]=p;
				p=p+2;
				}
			}
			else {
				a[i]=new int[5];
				for(int j=0; j<a[i].length; j++) {
					a[i][j]=k;
					k=k+3;
				}
			}
			/*if(i%2==0) {
				for(int j=0; j<a[i].length; j++) {
					a[i][j]=p;
					p=p+2;
				}
			}
			else {
				for(int j=0; j<a[i].length; j++) {
					a[i][j]=k;
					k=k+3;
				}
			} **/
		}
		return a;
	}

}
