package data.structures;

import java.util.Arrays;
import java.util.Collections;

public class Examples {

	public static void main(String[] args) {
	
		System.out.println("Hello");
		Examples object = new Examples();
		System.out.println(Arrays.toString(object.DutchSort(new int[] {2,1,0,0,3,2} )));
		
} 
	int[] DutchSort(int[] arr) {
		
		int i=0,j=0;
		int k = arr.length -1;
		int pivot =1;
		while(j<=k) {
			if(arr[j]< pivot) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j]= temp;
				i++;
				j++;
			}else if(arr[j]>pivot) {
				int Vtemp = arr[k];
				arr[k] = arr[j];
				arr[j]= Vtemp;
				k--;
			}else {
				j++;
			}
		}
		return arr;
	}
	
	int reverseInt(int n) {
		int reversedNum = 0;
		
		while(n!=0) {
			int temp = n%10;
			reversedNum = reversedNum*10 + temp;
			n = n/10;
		}
		
		return reversedNum;
	}
	
	boolean palindrome(char[] word) {
		int lastIndex = word.length -1;
		int firstIndex = 0;
			while(firstIndex < lastIndex) {
				if(word[firstIndex] != word[lastIndex]) return false;
				firstIndex++; lastIndex--;
			}
		                     
		
		return true;
	}
	
		boolean anagram(char[] s1, char[] s2) {
			if(s1.length != s2.length) return false;
			Arrays.sort(s1);
			Arrays.sort(s2);
			for(int i=0;i<s1.length;i++) {
				if(s1[i] != s2[i]) return false;
			}
			return true;
		}
	
	int[] reverseArr(int[] arr) {
		int lowIndex = 0;
		int highIndex = arr.length-1;
		
		while(lowIndex<highIndex) {
			int temp = arr[lowIndex];
			arr[lowIndex] = arr[highIndex];
			arr[highIndex] = temp;
			lowIndex++; highIndex--;
		}
		return arr;
	}
}