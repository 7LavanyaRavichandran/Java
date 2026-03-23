import java.util.Arrays;
import java.util.List;

public class BCE {

    /*
    Input :

			{

				{"1","2 "," 3", "4"},

				{"2", "3 "},

				{"6"},

				{"9 ", "8"},

				{"10 ", "10"}

			}

			Output : {81,9,1}

     */
    public static void main(String[] args) {

        List<List<String>> input = List.of(

                List.of("1","2 ", " 3", "4"),

                List.of("2","3 "),

                List.of("6"),

                List.of("9 ", "8"),

                List.of("10 ", "10")

        );


                input.stream().flatMap((e) -> e.stream()).map( s-> Integer.parseInt(s.trim())).filter(n -> (n%2)!=0 )
                        .map(n-> n*n).distinct().sorted((a,b)->b-a).forEach(System.out::println);

    }
}
