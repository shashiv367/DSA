package com.mru.faqs;

public class SepEvenAndOdd {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		int even=0,odd=0;
		for(int ele:arr) {
			if(ele%2==0) {
				even++;
			}else {
				odd++;
			}
		}
		
		int[] arr1 = new int[even];
		int[] arr2 = new int[odd];
		int even_index=0,odd_index=0;
		
		for(int ele: arr) {
			if(ele%2==0) {
				arr1[even_index++] = ele;
			}else {
				arr2[odd_index++] = ele;
			}
		}
		
		System.out.println("Even numbers:");
		for(int element:arr1) {
			System.out.print(element+" ");
		}
		System.out.println();
		System.out.println("Odd Numbers: ");
		for(int element:arr2) {
			System.out.print(element+" ");
		}
	}

}