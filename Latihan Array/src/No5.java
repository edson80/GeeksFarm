import java.util.*;

public class No5{
	
	public static void main (String[] args){
		HashMap x  = new HashMap();

		//populate hashmap
		x.put(1,"White");
		x.put(2,"Red");
		x.put(3,"Black");

		//mengambil value dari key 1
		String val =(String)x.get(1);

		//tampilkan value key 1
		System.out.println("Value for key 1 is: "+val);
		
		
	}
}