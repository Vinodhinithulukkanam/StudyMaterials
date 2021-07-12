package java8features;


public class ChildClass extends Parentclass {
	
	public String show(){
		return "Child class";
	}

	public static void main(String[] args) {
		
		ChildClass cc=new ChildClass();
		System.out.println(""+cc.show());
		
	}
	
}
