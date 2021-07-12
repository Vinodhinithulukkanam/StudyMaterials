package java8features;

public class Student {

	private int age;
	private String name;
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean equals(Object o){
		
		if(o!=null && o instanceof Student){
			String objName=((Student)o).getName();
			if(objName.equals(this.name)){
				return true;
			}
			return false;
		}
		return false;
	}
	
	
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	
	
}
