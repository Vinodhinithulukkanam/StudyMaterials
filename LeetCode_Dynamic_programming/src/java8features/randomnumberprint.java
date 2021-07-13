package java8features;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class randomnumberprint {

	public static void main(String[] args) throws IOException{
		 
		Scanner in=new Scanner(System.in);
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 
		 System.out.println("Enter the num. of trainee and problemset");
		 int n=Integer.parseInt(br.readLine());
		 String[] psetArr=new String[n];
		 System.out.println("Enter the num. of problems in each problem set with space");
		 for(int i=0;i<n;i++)
			{
			 psetArr[i]=in.next();
			}
		 
		int valuetobemoved=0;
		 int total = 0;
		 int pblmnum = 0;
		 int pdelete;
		 for(String num:psetArr){
			 total +=Integer.valueOf(num);
		 }
		 
		 pdelete=total%n;
		 pblmnum = total/n;
		 int tempb =0,tempa=0;
		 for(String num:psetArr){
		 int numVal = Integer.valueOf(num);
		    
		  if(numVal>pblmnum){
		    	valuetobemoved =numVal-pblmnum;
		       	 if(tempb!=0 && valuetobemoved < tempb){
				        tempb=valuetobemoved;
				        }else{
				        	tempb=valuetobemoved;
				        }
		    }
		 }
			 System.out.println(pdelete+" "+tempb);
		 
	 }
}
