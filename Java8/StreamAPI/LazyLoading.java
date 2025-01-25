package streamDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class LazyLoading {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		/*
		 * As firstElement is commented , There is no value needed as part of stream
		 * Operation, Hence Stream won't execute filter() and map() method -Lazy
		 * loading.
		 */
		Stream<Integer> s1 = arrayList.stream().filter(i -> i > 1);

		Stream<Integer> s2 = s1.map(new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer i) {
				System.out.println("Exceuted apply method");
				return i * 10;
			}
		});
		/* Here we have commented findfirst execution (Terminal Operation) */
        //  int firstElement=  s2.findFirst().get();
	}

}
