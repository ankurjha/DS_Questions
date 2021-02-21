import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.PriorityBlockingQueue;

public class CharDemo {

    public static void main(String[] args){

        Double d = new Double(78);
        Float f1 = new Float(67);
        float f = f1;

        System.out.println(toCamelCase("ANKUR KUMAR "));

        BlockingQueue<String> queue = new PriorityBlockingQueue<>();

    }

    public static String toCamelCase(final String init) {
        if (init==null)
            return null;

        final StringBuilder ret = new StringBuilder(init.length());

        for (final String word : init.split(" ")) {
            if (!word.isEmpty()) {
                ret.append(Character.toUpperCase(word.charAt(0)));
                ret.append(word.substring(1).toLowerCase());
            }
        }

        return ret.toString();
    }
}
