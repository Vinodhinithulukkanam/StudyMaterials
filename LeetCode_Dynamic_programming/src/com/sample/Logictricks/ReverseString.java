package com.sample.Logictricks;

public class ReverseString {

	public static void main(String[] args) {
	 char[]	s = {'h','e','l','l','o'};
		System.out.println(reverseint(-23));
		
	}
	public static char[] reverseString(char[] s) {
        int low=0;
        int high=s.length-1;
        
        while(low<high){
            if(s[low]!= s[high]){
                char buff=s[low];
                s[low]=s[high];
                s[high]=buff;
                low++;
            	high--;
            }else{
            	low++;
            	high--;
            }
        }
        return s;
    }
	
	public static int reverseint(int input) {
        int low=0;
        char[] s=(input+"").toCharArray();
        int high=s.length-1;
        boolean flag=false;
        int iPositive;
        
        if(s[0] == '-'){
            flag=true;
            low=1;
        }
        
        while(low<high){
            if(s[low]!= s[high]){
                char buff=s[low];
                s[low]=s[high];
                s[high]=buff;
                low++;
            	high--;
            }else{
            	low++;
            	high--;
            }
        }
       
        iPositive= Integer.parseInt(new String(s));
       
        
        if(flag){
        	System.out.println("flag true");
        	int iNegative = ( ~(iPositive - 1) ) ; 
        	 System.out.println("flag true"+iNegative);
        	 iPositive=iNegative;
        }
        
        return iPositive;
    }
}
