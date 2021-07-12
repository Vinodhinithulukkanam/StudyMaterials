package com.pattern.FactoryPattern;

/*This class will create object required by driver class*/

public class CalculateFactory {
	
	public Calculate chooseOperation(String operation){
		Calculate obj=null;
		if(("add").equalsIgnoreCase(operation)){
			 obj  = new Sum();
		}else if(("sub").equalsIgnoreCase(operation)){
			 obj  = new Subract();
		}else if(("divide").equalsIgnoreCase(operation)){
			 obj  = new Divide();
		}
		return obj;
		
	}

}
