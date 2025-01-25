package streamDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleStream {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

		int firstElement = arrayList.stream().filter(i -> i>1).map(i -> i*10).findFirst().get();
		 //Print firstElement after Stream
		 System.out.println("firstElement of consumed stream is:"+ firstElement);
		//Print firstElement of Array
		 System.out.println("firstElement of Array is:"+ arrayList.get(0));
	}

}
