import java.util.*;
import java.util.HashMap;
import java.util.Map;


public class No3{
	
	public static void main (String[] args){
		HashMap <String,String> x  = new HashMap <String,String>();

		x.put("Italy","Rome");
		x.put("Luxembourg","Luxembourg");
		x.put("Belgium","Brussels");
		x.put("Denmark","Copenhagen");
		x.put("Finland","Helsinki");
		x.put("France","Paris");
		x.put("Slovakia","Bratislava");
		x.put("Slovenia","Ljubljana");
		x.put("German","Berlin");
		x.put("Greece","Athens");
		x.put("Ireland","Dublin");
		x.put("Netherland","Amsterdam");

		Map<String,String> map = new TreeMap<String,String>(x);

		Set set = map.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()){
			Map.Entry me = (Map.Entry)iterator.next();
			System.out.print(me.getKey() + " : ");
			System.out.println(me.getValue());
		}
	}
}