package datastructs;

public class ListUtils {
	
	private ListUtils(){
		
	}
	
	public static Element listSearch(LinkedList list, int key){
		Element currElem = list.getHead();
		while(currElem != null && currElem.getVal() != key){
			currElem = currElem.getNext();
		}
		
		return currElem;
	}
}
