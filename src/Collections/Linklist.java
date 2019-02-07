package Collections;

import java.util.LinkedList;

public class Linklist {

	public static void main(String[] args) {
		LinkedList li=new LinkedList();
		li.add("test");
		li.add(2);
		li.add('A');
		li.add(20.33);
		li.add(null);
		li.add(true);
		System.out.println(li);


}
}

//using iterator;

	/*public static void main(String args[]){  
	LinkedList<String> al=new LinkedList<String>();  
	al.add("Ravi");  
	al.add("Vijay");  
	al.add("Ravi");  
	al.add("Ajay");  
	Iterator<String> itr=al.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	} */