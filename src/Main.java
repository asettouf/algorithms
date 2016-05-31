
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//testHeap();
		testQuickSort();
	}

	public static void testQuickSort(){
		int[] tt = {16,4,10,14,7,9,3,2,8,1};
		SortUtils.quickSort(tt, 0, tt.length - 1);
	}
	
	
	public static void testHeap(){
		 Heap heap = new Heap(12, 10);
		 //to use with max heapify loop
		 Heap heap2 = new Heap(12, 10);
		 int[] tt = {16,4,10,14,7,9,3,2,8,1};
		 heap.setHeap(tt);
		 heap2.setHeap(tt);
		// System.out.println(heap.getHeapElem(heap.getLeft(0)));
		// System.out.println(heap.getHeapElem(heap.getRight(2)));
		 System.out.println(heap);
		 HeapUtils.maxHeapify(heap, 0);
		 HeapUtils.maxHeapifyLoop(heap2, 0);
		 System.out.println("Recursive max heapify: " + heap);
		 System.out.println("Loop max heapify: " + heap2);
		 //build a max heap from it
		 Heap heap3 = new Heap(10,10);
		 int[] arr = {4,1,3,2,16,9,10,14,8,7};
		 heap3.setHeap(arr);
		// HeapUtils.buildMaxHeap(heap3);
		// System.out.println("Heap after max heapifying it " + heap3);
		 HeapUtils.heapSort(heap3);
		 String res = "[";
		 for(int i = 0; i < arr.length ; i++){
		 res += heap3.getHeapElem(i) + ",";
		 }
		 res = res.substring(0, res.length() - 1);
		 res += "]";
		 System.out.println("FINAL RES: " + res);
//		System.out.println(factorial(6));
//		System.out.println(factorialComplex(6));
	}
//	public static int factorial(int n) {
//		int res = 1;
//		for (int i = 1; i <= n; i++) {
//			res *= i;
//		}
//
//		return res;
//	}
//
//	public static int factorialComplex(int n) {
//		if(n == 1){
//			return 1;
//		}
//		if (n % 2 == 0) {
//			return 2 * factorialComplex(n - 1);
//		} else{
//			return 2 * factorialComplex(n - 1) + 1;
//		}
//	}

}
