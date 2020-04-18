package homework7;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodTest {
	
	public int count(ArrayList<?> list) {
		return list.size();
	}
	
	public static void main(String[] args) {
		
		MethodTest m = new MethodTest();
		
		ArrayList<String> strings = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five"));
		ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
		ArrayList<Double> doubles = new ArrayList<>(Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8));
		
		System.out.println(m.count(strings));
		System.out.println(m.count(integers));
		System.out.println(m.count(doubles));
	}
}
