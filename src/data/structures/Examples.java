package data.structures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Examples {

	public static void main(String[] args) {
	
		System.out.println("Hello");
		Examples object = new Examples();
//		System.out.println(object.isComplete(new int[]{-5, 6, 2, 3, 2, 4, 5, 11, 8, 7} ));
		
		System.out.println(object.isPrimeProduct(8));
} 
	   boolean isPalindrome(String str)
	    {
	 
	        // Pointers pointing to the beginning
	        // and the end of the string
	        int i = 0, j = str.length() - 1;
	 
	        // While there are characters to compare
	        while (i < j) {
	 
	            // If there is a mismatch
	            if (str.charAt(i) != str.charAt(j))
	                return false;
	 
	            // Increment first pointer and
	            // decrement the other
	            i++;
	            j--;
	        }
	 
	        // Given string is a palindrome
	        return true;
	    }
	   public static int waterTap(int[] a){

	        int highest = a[0];
	        int secondHighest = a[0];

	        for(int i=0;i<a.length;i++){
	            if(a[i]>highest){
	                highest = a[i];
	            }
	            else if(a[i]>secondHighest){
	                secondHighest =a[i];
	            }
	        }
	        int dimension = secondHighest*a.length;
	        
	        for(int i=0;i<a.length;i++){
	            if(a[i]>secondHighest) a[i] = secondHighest;
	            dimension -=a[i];
	        }
	        System.out.println(highest+" second: "+secondHighest);

	        return dimension;
	    }
	   
	   public double median(int[] values) {
	        Arrays.sort(values);
	        int length = values.length;
	        return length % 2 == 0
	                ? (values[length / 2] + values[length / 2 - 1]) / 2.0
	                : values[length / 2];
	    }
	   
	   
	   
	   
	   public int[] mode(int[] numbers) {

	        if (numbers.length == 0) {
	            return null;
	        }

	        HashMap<Integer, Integer> count = new HashMap<>();

	        for (int num : numbers) {
	            if (count.containsKey(num)) {

	                count.put(num, count.get(num) + 1);

	            } else {

	                count.put(num, 1);
	            }
	        }

	        int max = Collections.max(count.values());
	        ArrayList<Integer> modes = new ArrayList<>();

	        for (int num : count.keySet()) {
	            if (count.get(num) == max) {
	                modes.add(num);
	            }
	        }
	        return modes.stream().mapToInt(n -> n).toArray();
	    }
	   
	   public int[][] pascal(int n)
	    {
	        /**
	         * @param arr  An auxiliary array to store generated pascal triangle values
	         * @return
	         */
	        int[][] arr = new int[n][n];
	        /**
	         * @param line Iterate through every line and print integer(s) in it
	         * @param i Represents the column number of the element we are currently on
	         */
	        for (int line = 0; line < n; line++)
	        {
	            /**
	             *  @Every line has number of integers equal to line number
	             */
	            for (int i = 0; i <= line; i++)
	            {
	                // First and last values in every row are 1
	                if (line == i || i == 0)
	                    arr[line][i] = 1;
	                    // The rest elements are sum of values just above and left of above
	                else
	                    arr[line][i] = arr[line-1][i-1] + arr[line-1][i];
	            }
	        }
	        
	        return arr;
	    }
	   public  int absMax(int[] numbers) {
	        int absMaxValue = numbers[0];
	        for (int i = 1, length = numbers.length; i < length; ++i) {
	            if (Math.abs(numbers[i]) > Math.abs(absMaxValue)) {
	                absMaxValue = numbers[i];
	            }
	        }
	        return absMaxValue;
	    }
	
	 int isPrimeProduct(int n) {
		 for(int i=2;i<n;i++) {
			 if(n%i==0 && isPrime(i)==1) {
				 if(i*i==n) return 1;
				 else if(isPrime(n/i)==1) return 1;
			 }
		 }
		 return 0;
	 }
	
	 int isComplete (int[ ] a) {
			 int min=0, max=0,counteven=0;
			 for(int i=0; i<a.length; i++){
			 if(a[i]%2==0){
			 min = a[i];
			 max = a[i];
			 break;
			 }
			 
			 }
			 for(int j=0; j<a.length; j++){
			 if(a[j]%2==0){
			 counteven++;
			 if(max<a[j])
			 max=a[j];
			 if(min>a[j])
			 min = a[j];
			 }
			 }
			 int x = (max-min)-1;
			 int count=0;
			 int y = min+1;
			 for(int m=0; m<a.length; m++){
			 if(y==a[m] && y<max){
			 count++;
			 y++;
			 m=-1;
			 }
			 }
			 if(count == x)
			 return 1;
			 return 0;
			 
//		 boolean containsEven = false;
//		 int min = Integer.MAX_VALUE;
//		 int max = Integer.MIN_VALUE;
//		 int count  = 0;
//		 for(int i=0;i<a.length;i++) {
//			 if(a[i]%2==0) {
//				 if(a[i]<min) min = a[i];
//				 if(a[i]>max) max = a[i];
//				 containsEven = true;
//			 }
//		 }
//		 int x= min;
//		 for(int i=0;i<a.length;i++) {
//			while(x<max) {
//				if(a[i]==x) count++;
//				x++;
//			}
//		 }
//		 System.out.println(count);
//		 
//		 return  containsEven && min != max ? 1:0;
		 
}
	
	int isMagicArray (int[ ] a) {
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>0 && isPrime(a[i])==1) sum+=a[i];
		}
		
		return sum == a[0]? 1:0;
		
	}
	

	  int isPrime(int n){
	         if (n <= 1)
	            return 0;
	        // Check from 2 to n-1
	        for (int i = 2; i < n; i++)
	            if (n % i == 0)
	                return 0;
	        return 1;
	    }
	 int isHollow(int[] a) {
	        int left= 0, right=0, sum=0, mid= a.length/2;

//	        System.out.println(mid);
	        for(int i=0; i<mid; i++){
	            if(a[i]!=0) left++;
	        }
//	        System.out.println(left);
	        for(int j=a.length-1; j>=mid; j--){
	            if(a[j]!=0) right++;
	        }

//	        System.out.println(right);
	        sum = left + right;
//	        System.out.println(sum);

	       return a.length - sum >=3 && left==right ? 1: 0;

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