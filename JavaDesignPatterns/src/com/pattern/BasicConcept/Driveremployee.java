package com.pattern.BasicConcept;

public class Driveremployee {
    public static void main(String[] args){
	 
    	Email email=new Outlookmail();
    	Employee emp1=new Employee("Alan", 2,email);
    	email=new WebserviceMail();
    	Employee emp2=new Employee("George", 3,email);
    	emp1.notifyEmail();
    	emp2.notifyEmail();
    	System.out.println("First employee :"+emp1.toString());
    	System.out.println("Second  employee :"+emp2.toString());
 }
}
