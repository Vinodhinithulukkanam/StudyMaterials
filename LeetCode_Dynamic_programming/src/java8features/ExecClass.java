package java8features;

import java.util.HashSet;
import java.util.Set;

public class ExecClass {

public static void main(String[] args) {
		
		Student s1=new Student(21, "rahul");
		Student s2=new Student(21, "rahul1");
		System.out.println("hashCode() :"+(s1.hashCode()==s2.hashCode()));
		//System.out.println("p2.hashCode() :"+p2.hashCode());
		System.out.println("equals :"+s1.equals(s2));
		Set<Student> sp=new HashSet<Student>();
		/*for(int i=0;i<100;i++){
			sp.add(new Parentclass(i, "rahul"+i));
		}*/
		sp.add(s1);
		sp.add(s2);
		System.out.println("size :"+sp.size());
		long timeinmill=System.nanoTime();
	//	System.out.println(""+sp.contains(new Parentclass(1, "rahul1")));
		System.out.println("Elapse time: "+(System.nanoTime()-timeinmill));
	}
}
