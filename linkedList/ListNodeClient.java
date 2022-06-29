
public class ListNodeClient {
public static void main(String[] args){
	LinkedIntList list=new LinkedIntList();
	list.addSorted(4);
	list.add(5);
	list.add(6);
	list.add(45);
	list.add(8,2);
	System.out.println("Value at index 0 is "+list.get(0));
	
	list.addSorted(17);
	list.print();
	
	System.out.println("How many values? " + list.size());
	System.out.println(list.isEmpty());
	System.out.println(list.toString());
	System.out.println(list.contains(17));
	System.out.println(list.indexOf(4));
	
	
	}
}
