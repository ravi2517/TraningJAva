package raviJava;

import java.util.Scanner;

public class Evenodd {
		static int isEven(int n) {
			return(n&1);
		}

		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			int n=sc.nextInt();
			if(isEven(n)==0) {
				System.out.println("Even number");
				 
			}else {
				System.out.println("Odd number");
			}

		}

	}


