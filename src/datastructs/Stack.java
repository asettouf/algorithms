package datastructs;

public class Stack {
	private int[] stack;
	private int top;
	
	public Stack(int size){
		this.stack = new int[size];
		this.top = 0;
	}
	
	public void push(int elem) throws Exception{
		if(this.top == this.stack.length){
			throw new Exception("The current stack is already filled");
		}
		this.stack[this.top++] = elem;
		
	}
	
	public int pop() throws Exception{
		if(this.top == 0){
			throw new Exception("Current stack is empty");
		}
		return this.stack[--this.top];
		
	}
	
	public int[] getStack() {
		return stack;
	}

	public void setStack(int[] stack) {
		this.stack = stack;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}
	

}
