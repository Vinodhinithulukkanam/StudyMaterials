package com.DSA.sorting;
import java.util.Arrays; 
public class MergeSort {
	
	    public static void merge_Sort(int[] numArray) { 
	        //return if array is empty
	        if(numArray == null) { 
	            return; 
	        } 
	          if(numArray.length > 1) { 
	            int mid = numArray.length / 2; //find mid of the array
	   
	            // left half of the array 
	            int[] left = new int[mid]; 
	            for(int i = 0; i < mid; i++) { 
	                left[i] = numArray[i]; 
	            } 
	            // right half of the array 
	            int[] right = new int[numArray.length - mid]; 
	            for(int i = mid; i < numArray.length; i++) { 
	                right[i - mid] = numArray[i]; 
	            } 
	            merge_Sort(left);   //call merge_Sort routine for left half of the array 
	            merge_Sort(right);   // call merge_Sort routine for right half of the array
	   
	            int i = 0; 
	            int j = 0; 
	            int k = 0; 
	              // now merge two arrays
	            while(i < left.length && j < right.length) { 
	                if(left[i] < right[j]) { 
	                    numArray[k] = left[i]; 
	                    i++; 
	                } 
	                else { 
	                    numArray[k] = right[j]; 
	                    j++; 
	                } 
	                k++; 
	            } 
	            System.out.println("remaining elements :" + Arrays.toString(numArray)); 
	   // remaining elements 
	            while(i < left.length) { 
	                numArray[k] = left[i]; 
	                i++; 
	                k++; 
	            } 
	            while(j < right.length) { 
	                numArray[k] = right[j]; 
	                j++; 
	                k++; 
	            } 
	        } 
	    }
	public static void main(String[] args) { 
	        int numArray[] = {10, 23, -11, 54, 2, 9, -10, 45}; 
	        int i=0; 
	        //print original array       
	        System.out.println("Original Array:" + Arrays.toString(numArray)); 
	        //call merge_Sort routine to sort arrays recursively
	        merge_Sort(numArray); 
	        //print the sorted array
	        System.out.println("Sorted array:" + Arrays.toString(numArray)); 
	   } 
	  
}
