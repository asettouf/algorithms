package datastructs;

public class Element {
	
	private Element prev;
	private Element next;
	private int val;
	
	public Element() {
	}

	public Element(int val) {
		
		this.val = val;
	}
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	public Element getPrev() {
		return prev;
	}
	public void setPrev(Element prev) {
		this.prev = prev;
	}
	public Element getNext() {
		return next;
	}
	public void setNext(Element next) {
		next.setPrev(this);
		this.next = next;
	}
	
	public String toString(){
		return "Value: " + this.val;
	}

}
