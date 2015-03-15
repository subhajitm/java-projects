import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("abc");
		list.add(new Integer(5)); //OK
		 
		for(Object obj : list){
		        String str=(String) obj; //type casting leading to ClassCastException at runtime
		}
		
		Set<String> s = new Set();
	}

}
