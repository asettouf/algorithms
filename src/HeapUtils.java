
public class HeapUtils {
	
	private HeapUtils() {
		// TODO Auto-generated constructor stub
	}
	
	//bug in there :(
	public static void maxHeapify(Heap heap, int index){
		int l = heap.getLeft(index);
		int r = heap.getRight(index);
		int largest = 0;
		if (l < heap.getHeapSize() && heap.getHeapElem(l) > heap.getHeapElem(index)){
			largest = l;
		} else{
			largest = index;
		}
		if( r < heap.getHeapSize() && heap.getHeapElem(r) > heap.getHeapElem(largest)){
			largest = r;
		} 
		if(largest != index){
			heap.swapElement(index, largest);
			maxHeapify(heap, largest);
		}
	}
	
	public static void maxHeapifyLoop(Heap heap, int index){
		for(int i = index; i < heap.getHeapSize(); i++){
//			System.out.println(i);
			swapElem(heap, i);
		}
	}
	public static void swapElem(Heap heap, int index){
		int l = heap.getLeft(index);
		int r = heap.getRight(index);
		int largest = 0;
		if (l < heap.getHeapSize() && heap.getHeapElem(l) > heap.getHeapElem(index)){
			largest = l;
		} else{
			largest = index;
		}
		if( r < heap.getHeapSize() && heap.getHeapElem(r) > heap.getHeapElem(largest)){
			largest = r;
		} 
		if(largest != index){
			heap.swapElement(index, largest);
		}
	}
	
	public static void buildMaxHeap(Heap heap){
		//heap.setHeapSize(heap.getHeap().length);
		for(int i = heap.getHeapSize()/2; i >= 0; i--){
			HeapUtils.maxHeapifyLoop(heap, i);
		}
	}
	
	public static void heapSort(Heap heap){
		buildMaxHeap(heap);
		System.out.println(heap);
		int total = heap.getHeapSize();
		for(int i = heap.getHeapSize() - 1; i > 0; i--){
			int buff = heap.getHeapElem(i);
			heap.getHeap()[i] = heap.getHeap()[0];
			heap.getHeap()[0] = buff;
			heap.setHeapSize(heap.getHeapSize() - 1);
			
			maxHeapify(heap, 0);
			System.out.println("Step: " + (total - i) + " Heap: " +heap);
		}
	}
	
	public static int heapMax(Heap heap){
		return heap.getHeapElem(0);
	}
}
