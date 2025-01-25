package streamDemo;

import java.util.stream.Stream;

public class StreamLeetCodeProblems {
	
	  public static int findMinimumOperations(String s1, String s2, String s3) {
	        if(s1.equals(s2) && s1.equals(s3)) return 0;

	        int min = Stream.of(s1,s2,s3).min((a,b) ->s1.length()-s2.length()).get().length();
			return min;

	    }
	public static void main(String[] args) {
	
		String s1 ="aaa";
		String s2="aa";
		String s3 = "ab";
		
		try {
			int result = findMinimumOperations(s1,s2,s3);
			System.out.println(result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
