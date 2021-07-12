package com.DSA.sorting;

public class BubbleSort {

	public static void main(String[] args) {

		//a=5,b=2
		//a=a+b;
		//b=a-b;
		//b=a-b;
		int[] arr={6,5,3,2,8,4,1,7};
		//List<Integer> arr=Arrays.asList(6,5,3,2,8,4,1,7);
		int length=arr.length-1;
		for(int i=0;i<length;i++){
			for(int j=0;j<length;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
		}
		for (int index=0 ; index<length ;index++) {
			System.out.println(arr[index]);
		}
		

	}

}
