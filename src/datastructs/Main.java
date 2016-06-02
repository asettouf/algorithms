package datastructs;

import utils.DataUtils;

public class Main {

	public static void main(String[] args) {
//		testStack();
//		testQueue();
		testLinkList();

	}
	
	public static void testLinkList(){
		Element elem1 = new Element(1);
		Element elem2 = new Element(2);
		elem1.setNext(elem2);
		LinkedList li = new LinkedList(elem1);
		Element res = ListUtils.listSearch(li, 1);
		System.out.println(res);
	}

	public static void testStack(){
		Stack st = new Stack(2);
		try {
			st.push(1);
			st.push(2);
//			st.push(3);
			DataUtils.printStack(st, "Stack");
			System.out.println(st.pop());
			System.out.println(st.pop());
			DataUtils.printStack(st, "Stack after pop");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void testQueue(){
		
		try {
			Queue q = new Queue(2);
			q.enqueue(1);
			System.out.println("HEAD: " + q.getHead());
			System.out.println("TAIL: " + q.getTail());
			q.enqueue(2);
			System.out.println("HEAD: " + q.getHead());
			System.out.println("TAIL: " + q.getTail());
			System.out.println(q.dequeue());
			System.out.println("HEAD: " + q.getHead());
			System.out.println("TAIL: " + q.getTail());
			System.out.println(q.dequeue());
			System.out.println("HEAD: " + q.getHead());
			System.out.println("TAIL: " + q.getTail());
			System.out.println(q.dequeue());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
