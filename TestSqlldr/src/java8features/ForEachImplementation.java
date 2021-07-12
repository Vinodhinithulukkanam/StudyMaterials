package java8features;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ForEachImplementation {

	public static void main(String[] args) {
		Instant start=null;
		Instant end=null;
		Duration timeelapse=null;
		File newFile=new File("E:\\testpath\\newfile");
		
		try{
		//creating sample Collection
			newFile.getAbsoluteFile().deleteOnExit();
			if(!newFile.exists()){
				if(!newFile.exists())
					newFile.createNewFile();
				
			}
		final BufferedWriter buf=new BufferedWriter(new PrintWriter(newFile));
		List<ArrayList<Integer>> newList = new ArrayList<ArrayList<Integer>>();
		final ArrayList<Integer> myList=new ArrayList<Integer>();
		
			for(int j=0;j<10;j++){
		for(int i=0; i<1000; i++) myList.add(i);
		newList.add(j,myList);
			}
		
		//traversing using Iterator
		 start=Instant.now();
		Iterator<ArrayList<Integer>> it = newList.iterator();
		while(it.hasNext()){
			ArrayList<Integer> ele = it.next();
			 Iterator<Integer> it1=ele.iterator();
				while(it1.hasNext()){
					
					int i=it1.next();
					buf.write("Iterator Value::"+i);
				}
			
		}
		end=Instant.now();
		timeelapse=Duration.between(start, end);
		System.out.println("Elapse time for legacy implementation :"+timeelapse.toMillis());
		
		//traversing through forEach method of Iterable with anonymous class
		 start=Instant.now();
		 newList.forEach(new Consumer<ArrayList<Integer>>() {

			public void accept(ArrayList<Integer> t) {
				myList.forEach(new Consumer<Integer>() {
						
						public void accept(Integer i){
							try {
								buf.write("Iterator Value::"+i);
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					});
					
					
			}

		});
		
		end=Instant.now();
		timeelapse=Duration.between(start, end);
		System.out.println("Elapse time for consumer 1 implementation :"+timeelapse.toMillis());
		//traversing with Consumer interface implementation
		
		/* start=Instant.now();
		MyConsumer action = new MyConsumer(buf);
		myList.forEach(action);
		end=Instant.now();
		timeelapse=Duration.between(start, end);
		System.out.println("Elapse time for consumer 2 implementation :"+timeelapse.toMillis());*/
		
		buf.flush();
		buf.close();
		newFile.getAbsoluteFile().deleteOnExit();
		}
		catch(Exception e){
			e.getMessage();
			
		}finally{
			
		}
	}

}

//Consumer implementation that can be reused
/*class MyConsumer implements Consumer<String>{

	public BufferedWriter buffer;
	
	public MyConsumer(BufferedWriter buf) {
		setBuffer(buf);
	}

	public BufferedWriter getBuffer() {
		return buffer;
	}

	public void setBuffer(BufferedWriter buffer) {
		this.buffer = buffer;
	}


	public void accept(String t) {
		try {
			getBuffer().write("Iterator Value::"+t);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}*/
