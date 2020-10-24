import java.util.ArrayList;
import java.util.List;

class ReverseLists {
	public static ArrayList<Integer> reverseIntList(ArrayList<Integer> oldList) {
  	ArrayList<Integer> newList = new ArrayList<>();
  	for (int i = (oldList.size() - 1); i > -1; i--) {
  		newList.add(oldList.get(i));
  	}
  	return newList;
	}
  
  public static ArrayList<String> reverseStrList(ArrayList<String> oldList) {
  	ArrayList<String> newList = new ArrayList<>();
  	for (int i = (oldList.size() - 1); i > -1; i--) {
  		newList.add(oldList.get(i));
  	}
  	return newList;
	}

}
