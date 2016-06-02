package datastructs;

public class Queue {
	private int[] queue;
	private int tail;
	private int head;
	
	public Queue(int size){
		this.queue = new int[size];
		this.tail = 0;
		this.head = 0;
	}
	
	public void enqueue(int elem) throws Exception{
		if(this.head == this.tail + 1){
			throw new Exception("Queue is full");
		}
		this.queue[this.tail] = elem;
		if(this.tail == this.queue.length){
			this.tail = 0;
		} else{
			this.tail++;
		}
		
	}
	
	public int dequeue() throws Exception{
		if(this.head == this.tail){
			throw new Exception("Queue is empty");
		}
		int elem = this.queue[this.head];
		if(this.head == this.queue.length){
			this.head = 0;;
		} else{
			this.head++;
		}
		return elem;
		
	}
	
	public int[] getQueue() {
		return queue;
	}

	public void setQueue(int[] stack) {
		this.queue = stack;
	}

	public int getTail() {
		return tail;
	}

	public void setTail(int top) {
		this.tail = top;
	}

	public int getHead() {
		return head;
	}

	public void setHead(int head) {
		this.head = head;
	}
	

}
