package sort;

public class Heap {
	
	
	private int heapSize;
	private int heap[];
	
	public Heap(int length, int size) {
		heap = new int[length];
		heapSize = size;
	}
	
	public int getLeft(int index){
		return index * 2 + 1;
		
	}
	
	public int getRight(int index){
		return (index + 1)*2;
		
	}

	public int getHeapSize() {
		return heapSize;
	}

	public void setHeapSize(int heapSize) {
		this.heapSize = heapSize;
	}

	public int[] getHeap() {
		return heap;
	}

	public void setHeap(int[] heap) {
		this.heap = heap;
	}
	
	public int getHeapElem(int i){
		
		return this.heap[i];
	}
	
	public int getNumberOfLeaf(){
		return this.heapSize /2;
	}
	
	public void swapElement(int i, int swapIndex){
		int buff = this.heap[i];
		this.heap[i] = this.heap[swapIndex];
		this.heap[swapIndex] = buff;
	}
	
	public String toString(){
		String res = "[";
		for(int i = 0; i < this.heap.length ; i++){
			res += this.getHeapElem(i) + ",";
		}
		res = res.substring(0, res.length() - 1);
		res += "]";
		return res;
	}

}
