import java.util.ArrayList;

public class BasicJava{
	// Print 1-255
	public static void oneTo255(){
		for(int i=1 ; i<=255 ; i++){
			System.out.println(i);
		}
	}

	// Print odd numbers between 1-255
	public static void oneTo255odd(){
		for(int i=1 ; i<=255 ; i++){
			if (i%2 !=0){
				System.out.println(i);
			}
		}
	}

	// Print Sum
	public static void sum255(){
		int sum = 0;
		for(int i=0 ; i<=255 ; i++){
			sum = sum+i;
			System.out.println("New number: " + i + " Sum: " +  sum );
		}
	}

	// Iterating through an array
	public static void iterate(int[] x){
		for(int i=0 ; i<x.length ; i++){
			System.out.println(x[i]);
		}
	}

	// Find Max
	public static void max(int[] arr){
		int max = arr[0];
		for(int i=1 ; i<arr.length ; i++){
			if (max < arr[i]) {
				max = arr[i];	
			}
		}
		System.out.println(max);
	}

	// Get Average
	public static void avg(int[] arr2){
		int sum = 0;
		for(int i=0 ; i<arr2.length ; i++){
			sum = sum+arr2[i];
		}
		int avg = sum/arr2.length;
		System.out.println(avg);
	}

	// Array with Odd Numbers
	public static void arrodd(){
		ArrayList<Integer> y = new ArrayList<Integer>();
		for(int i=1 ; i<=255 ; i++){
			if (i%2 !=0){
				y.add(i);
			}
		}
		System.out.println(y);
	}

	// Greater Than Y
	public static void greater(int[] x, int y){
		int count = 0;
		for(int i=0 ; i<x.length; i++){
			if (x[i] > y){
				count += 1 ;
			}
		}
		System.out.println(count);
	}


	// Square the values
	public static void square(int[] x){
		for(int i=0 ; i<x.length; i++){
			x[i] *= x[i];
			System.out.println(x[i]);
		}
	}

	// Eliminate Negative Numbers
	public static void negative(int[] x){
		for(int i=0 ; i<x.length; i++){
			if (x[i] <0){
				x[i] = 0;
			}
			System.out.println(x[i]);
		}
	}

	// Max, Min, and Average
	public static void MaxMinAvg(int[] x){
		int max = x[0];
		int min = x[0];
		int sum = 0;
		for(int i=0 ; i<x.length; i++){
			if (x[i] > max){
				max = x[i];
			}
			if (x[i] < min){
				min = x[i];
			}
			sum =sum+x[i];
		}
		double avg = sum/x.length;
		System.out.println(max);
		System.out.println(min);
		System.out.println(avg);
	}

	// Shifting the Values in the Array
	public static void shifting(int[] x){
		for(int i=0 ; i<x.length-1; i++){
			x[i] = x[i+1];
		}
		x[x.length-1]=0;
		iterate(x);
	}



	public static void main(String[] args) {
		oneTo255();

		oneTo255odd();

		sum255();

		int[] myarray = {1,3,5,7,9,13};
		iterate(myarray);

		int[] arr = {-3, -5, -7};
		max(arr);

		int[] arr2 = {2, 10, 3};
		avg(arr2);

		arrodd();

		int[] arr3 = {1, 3, 5, 7};
		greater(arr3 , 3);

		int[] arr4 = {1, 5, 10, -2};
		square(arr4);

		int[] arr5 = {1, 5, 10, -2};
		negative(arr5);

		int[] arr6 = {1, 5, 10, -2};
		MaxMinAvg(arr6);

		int[] arr7 = {1, 5, 10, 7, -2};
		shifting(arr7);
	}
	
	
}