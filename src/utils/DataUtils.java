package utils;

import datastructs.Stack;

public class DataUtils {
	private DataUtils() {

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

	public static void printStack(Stack stack, String printBefore){
		String res = "[";
		for(int i = 0; i < stack.getTop() ; i++){
			 res += stack.getStack()[i] + ",";
			 }
		 res = res.substring(0, res.length() - 1);
		 res += "]";
		 System.out.println(printBefore + ": "+ res);
	}
}
