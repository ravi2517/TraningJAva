package Javaprograms;
import java.util.*;
public class Binary_search {
	private static void check(int[]arr, int tocheckvalue) {
		boolean test=false;
		for(int element: arr) {
			if(element==tocheckvalue) {
				test=true;
				break;
			}
		}
		System.out.println("Is"+" "+ tocheckvalue+" "+"present in the string"+" :"+test);
	}
	
	

	public static void main(String[] args) {
		int arr[]= {1,8,9,7,6,5,2,3};
		int tocheckvalue=5;
		System.out.println("Arrays:"+Arrays.toString(arr));
		check(arr, tocheckvalue);

	}

}
