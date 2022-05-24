package corejava;
import java.util.*;
public class LinkedColle2 {

	public static void main(String[] args) {
		
		LinkedList<String> al=new LinkedList<String>();  
		al.add("priya");  
		al.add("Vijay");  
		al.add("Ravi");  
		al.add("priya");  
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  

	}

}
