import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreams {

    public static void main(String args[]){

        /*System.out.println(Arrays.stream(new int[]{2,4 })
                .map(x -> x *x)
                .sum());*/

        Arrays.stream(new int[]{2,4,6,8,10 })
                .map(JavaStreams::squareIt) // or .map(i -> i * i)
                .average()
                .ifPresent(System.out::println);

        List<String> names = new ArrayList<String>();
        names.add("Ajeet");
        names.add("Negan");
        names.add("Aditya");
        names.add("Steve");

        //Using Stream and Lambda expression
        long count = names.stream().filter(str->str.length()<6).count();
        System.out.println("There are "+(names.stream().filter(str->str.length()<6).count())+" strings with length less than 6");

        List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println("Filtered List: " + filtered);

        String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("Merged String: " + mergedString);
    }

    public static int squareIt(int i){
        return i * i;
    }
}
