import java.util.*;

public class Test {
    public static void main(String[] args) {
        /*Set<String> srt = null;

        for(String s : srt){
            s.length();
        }

        Random r = new Random();
        r.nextInt(100);*/
        String SPLITTER = "____";
        //String INPUT = "I'd rather ____ than ____ any day! My favorite ingredient is ____.\nThis is ____ another ____ for dev test.";
        String INPUT = "I'd rather ____ than ____ any day";
        String[] splitData = INPUT.split(SPLITTER);
        System.out.println("splitData.length = "+splitData.length);
        for(String data : splitData){
            System.out.println(data);
        }

        StringTokenizer tokens = new StringTokenizer(INPUT,SPLITTER);
        System.out.println("tokens.length = "+tokens.countTokens());

        int index=1;
        List<String> arr = new ArrayList<>();
        arr.add("babaji");
        arr.add(null);
        if(arr.size()-1 >= index && arr.get(index) != null){
            System.out.println(arr.get(index));
        }
    }
}
