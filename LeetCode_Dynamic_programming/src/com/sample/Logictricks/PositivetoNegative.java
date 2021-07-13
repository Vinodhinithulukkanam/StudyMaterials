package com.sample.Logictricks;

public class PositivetoNegative {
	public static void main (String[] args) throws java.lang.Exception
    {
        int iPositive = 15;
        int iNegative = ( ~(iPositive - 1) ) ; // Use extra brackets when using as C preprocessor directive ! ! !...
        System.out.println(iNegative);

        iPositive =  ~(iNegative - 1)  ;
        System.out.println(iPositive);

        iNegative = 0;
        iPositive = ~(iNegative - 1);
        System.out.println(iPositive);


    }
}
