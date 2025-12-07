package com.coding.handson;
/*
2️⃣ Find duplicate words in a string or  duplicate character from a string/sentence

Variants:
Preserve order
Ignore case / retain case
Sort by frequency
Using Java 8 Streams
 */
import javax.sound.midi.Soundbank;
import java.util.*;
import java.util.stream.Collectors;

public class DuplicatesInAString {

    public static void main(String[] args) {

        String s = "Laav is a a LaaV is a i i i n";
        List<Map.Entry<String,Long>> hm =
            Arrays.stream(s.split("\\s"))
                    //use s.split("\\s") for splitting as word, if you gave s.split("") it will parse each charcter
                    .collect(Collectors.groupingBy(map->map.toLowerCase(), LinkedHashMap:: new,Collectors.counting())) //Collectors.counting returns Long
                . entrySet().stream()
                .filter(e -> e.getValue()>1)
                .sorted((a,b)->Long.compare(a.getValue() , b.getValue())) //Here we can't use Itger because collectors.counting return long
                .collect(Collectors.toList());

        System.out.println(hm);

        List <String> listduplictaes =Arrays.asList("sss","sss","ii");

       List<String> ll =  listduplictaes.stream().distinct().collect(Collectors.toList());
        System.out.println(ll);
    }
}
