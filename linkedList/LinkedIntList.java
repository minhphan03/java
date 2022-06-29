
public class LinkedIntList {
	private ListNode front;
	public LinkedIntList(){
		front=null;
	}
	public void add(int value){
		if(front==null){
			front=new ListNode(value);
		}
		else{
			ListNode current=front;
			while(current.next!=null){
				current=current.next;
			}
			current.next=new ListNode(value);
		}
		
		
	}
	public void print(){
		ListNode current=front;
		//String result=" ";
		while(current.next!=null){
			//result=result+current.data;
			System.out.println(current.data);
			current=current.next;
			
		}
		System.out.println(current.data);
		//return result;
	}
	public void add(int value,int index){
		
		if(index==0){
			front=new ListNode(value,front);
		}
		else
		{
			ListNode current=front;
			for(int i=0;i<index-1;i++){
				current=current.next;
			}
			current.next=new ListNode(value,current.next);
		}
	}
	public int get(int index){
		ListNode current=front;
		for(int i=0;i<index;i++){
			current=current.next;
		}
		return current.data;
	}
	public void remove(int index){
		if(index==0){
			front=front.next;
		}
		else{
			ListNode current=front;
			for(int i=0;i<index-1;i++){
				current=current.next;
			}
			current.next=current.next.next;
		}
	}
	public void addSorted(int value){
		if(front==null||value<front.data){
			front=new ListNode(value,front);
		}
		else{
			ListNode current=front;
			while(current.next!=null&&current.next.data<value){
				current=current.next;
			}
			current.next=new ListNode(value,current.next);
			
		}
	}
	
	public int size() {
		if (front == null) {
			return 0;
		}
		
		else {
			int count = 0;
			ListNode current = front;
			while (current != null) {
				count++;
				current = current.next;
			}
			return count;
		}

	}
	
	public boolean isEmpty() {
		if (front == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void clear() {
		front = null;
	}
	
	public String toString() {
		String s ="[";
		ListNode current = front;
		while (current.next != null) {
			s += current.data+ ", ";
			current = current.next;
		}
		s += current.data + "]";
		
		return s;
	}
	
	public int indexOf(int data) {
		ListNode current = front;
		int index = 0;
		while (current != null) {
			if (current.data == data) {
				return index;
			}
			current = current.next;
			index++;
		}
		return index;
	}
	
	public boolean contains(int data) {
		ListNode current = front;
		while (current != null) {
			if (current.data == data) {
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
}
