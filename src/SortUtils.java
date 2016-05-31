import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SortUtils {
	
	private SortUtils(){
		
	}
	
	public static void printArray(int[] arr, String printBefore){
		String res = "[";
		for(int i = 0; i < arr.length ; i++){
			 res += arr[i] + ",";
			 }
			 res = res.substring(0, res.length() - 1);
			 res += "]";
			 System.out.println(printBefore + ": "+ res);
	}
	public static void quickSort(int[] arr, int p, int r){
		printArray(arr, "Before quicksorting");
		if (p < r){
			int q = partition(arr, p, r);
			quickSort(arr, p, q - 1);
			quickSort(arr, q  + 1, r);
		}
		printArray(arr, "After quicksorting");
	}
	
	public static void randomizedQuickSort(int[] arr, int p, int r){
		printArray(arr, "Before quicksorting");
		if (p < r){
			int q = randomizePartition(arr, p, r);
			randomizedQuickSort(arr, p, q - 1);
			randomizedQuickSort(arr, q  + 1, r);
		}
		printArray(arr, "After quicksorting");
	}
	public static int randomizePartition(int[] arr, int p, int r){
		int i = ThreadLocalRandom.current().nextInt(p, r + 1);
		int buff = arr[i];
		arr[i] = arr[r];
		arr[r] = buff;
		return partition(arr, p, r);
	}
	
	
	
	public static int partition(int[] arr, int p, int r){
		int pivot = arr[r];
		int i = p - 1;
		int buff = 0;
		for(int j = p; j < r; j++){
			if(arr[j] <= pivot){
				i++;
				buff = arr[i];
				arr[i] = arr[j];
				arr[j] = buff;
			}
		}
		buff = arr[i + 1];
		arr[i + 1] = arr[r];
		arr[r] = buff;
		return i + 1;	
	}
}
