
public class SelectionUtils {
	
	private SelectionUtils(){
		
	}
	
	public static int randomizedSelect(int[] arr, int p, int r, int i){
		if (p == r){
			return arr[p];
		}
		
		int q = SortUtils.randomizePartition(arr, p, r);
		int k = q - p + 1;
		if(i == k){
			return arr[q];
		} else if(i < k){
			return randomizedSelect(arr, p, q-1, i);
		} else{
			return randomizedSelect(arr, q + 1, r, i - k);
		}
		
	}

}
