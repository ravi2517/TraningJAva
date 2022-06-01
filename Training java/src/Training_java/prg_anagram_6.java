package Javaprograms;
import java.util.*;
public class prg_anagram_6 {
	static boolean areAnagram(char[] str1 ,char[] str2 ) {
		int n1= str1.length;
		int n2= str2.length;
		if (n1!=n2) {
			return false;
		}
		Arrays.sort(str1);
		Arrays.sort(str2);
		for(int i=0; i<n1; i++) {
			if(str1[i]!=str2[i]) {
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		char str1[]= {'a','m','i','t'};
		char str2[]= {'t','i','m','a'};
		if(areAnagram(str1,str2)) {
			System.out.println("The two string are anagram to each other");
		}else {
			System.out.println("The two string are not anagram to each other");
		}

	}

}
