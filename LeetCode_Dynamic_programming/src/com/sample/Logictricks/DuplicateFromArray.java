package com.sample.Logictricks;

public class DuplicateFromArray {

	public static void main(String[] args) {
int[] num={0,0,1,2,3,3,4,4,4,5,6,6,6,7,7};
//5
System.out.println(removeDuplicates(num));
	}
	 public static int removeDuplicates(int[] nums) {
	        int startIndex=0;
	        int endIndex=1;
	        int k=nums.length;
	        while( startIndex!=endIndex){
	            if(nums[startIndex]<nums[endIndex]){
	                    nums[startIndex+1]=nums[endIndex];
	                    if(endIndex<(nums.length-1)){
	                    	startIndex++;
		                    endIndex++;
		                    }else{
		                        endIndex=startIndex;
		                    }
	                     
	                
	            }else{
	                    if(endIndex<(nums.length-1)){
		                    endIndex++; 
	                    }else{
	                        endIndex=startIndex;
	                    }
	               k--;
	            }
	            
	        }
	        for (int i = 0; i < nums.length; i++) {
				System.out.println(nums[i]);
			}
	       	        return k;
	    }

}
