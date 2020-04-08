package homework6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class ListManipulator extends ArrayList<Integer>{

	public ArrayList<Integer> sort(ArrayList<Integer> myLst, Boolean ascending) {
		ArrayList<Integer> sorted = new ArrayList<Integer>(myLst);
		if(ascending) {
			Collections.sort(sorted);
		}
		else {
			Collections.reverse(sorted);
		}
		return sorted;
	}
	
	public ArrayList<Integer> swapLargestSmallest(ArrayList<Integer> myLst) {
		ArrayList<Integer> swapped = new ArrayList<Integer>(myLst);
		
		int minIndex = swapped.indexOf(Collections.min(swapped));
		int maxIndex = swapped.indexOf(Collections.max(swapped));
		int min = swapped.get(minIndex);
		
		swapped.set(minIndex, swapped.get(maxIndex));
		swapped.set(maxIndex, min);
		
		return swapped;
	}
	
	public void table(ArrayList<Integer> myLst) {
		HashSet<Integer> set = new HashSet<Integer>();
		ArrayList<Integer> unique = new ArrayList<Integer>();
		
		set.addAll(myLst);
		unique.addAll(set);
		
		String alignment = "|  %7d  |  %10d  |%n";
		
		System.out.format("+--------------------------+%n");
		System.out.format("|  Integer  |  Occurances  |%n");
		System.out.format("+--------------------------+%n");
		
		for(int i = 0; i < unique.size(); i++) {
			int element = unique.get(i);
			int frequency = Collections.frequency(myLst, element);
			System.out.format(alignment, element, frequency);
		}
		System.out.format("+--------------------------+%n");
	}
	
}
