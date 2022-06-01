package Javaprograms;
import java.util.Scanner;
public class PAlindrom {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int rev=0;
		int sum;
		while(n>0) {
			sum=n%10;
	        rev=rev*10+sum;
	        n=n/10;

		}
		if(rev==temp) {
			System.out.println(temp+" " +"is palindrom");
		}else {
			System.out.println(temp+" "+ "is not palindrom" );
		}

	}

}
