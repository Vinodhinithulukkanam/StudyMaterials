package com.DSA.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] arr={6,5,3,2,8,4,1,7};
		int n=arr.length;
		int min;
		for(int i=0;i<n-1;i++){
			min=i;																
			
			for(int j=i+1;j<n;j++){
				if(arr[j]<arr[min]){
					min=j;
					
				}
			}
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			
		}
		
		for (int index=0 ; index<n ;index++) {
			System.out.println(arr[index]);
		}
	}

}
