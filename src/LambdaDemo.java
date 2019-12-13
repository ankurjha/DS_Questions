import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//https://www.youtube.com/watch?v=yb46iD5dJYY&t=26s
//https://www.youtube.com/watch?v=5uJ8jSf-c9g

public class LambdaDemo {

    public static void main(String args[]){

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        // using foreach loop which accept Consumer as its argument .

        /*Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.println(i*i);
            }
        };

            list.forEach(new Consumer<Integer>() {
                @Override
                public void accept(Integer i) {
                    System.out.println(i*i);
                }
        });

        or list.forEach(consumer);
        */

        // As Consumer is functional interface(have only one abstract class , its understood that right side of =
        // is new Consumer with accept method implementation). So its redundant and we will remove it.

        //Consumer<Integer> consumer = (Integer i) -> System.out.println(i*i);
        //list.forEach(consumer);

        //As we know the Consumer is of type Integer , so no need to specify explicitly (Integer i), simple (i) will work.
        // And because we have one one argument (i) can be replaced by i.

        //Consumer<Integer> consumer = i -> System.out.println(i*i);
        //list.forEach(consumer);

        //Substituting consumer in foreach , we get


        //list.forEach(i -> System.out.println(i*i));

        //If we are only to print the i , we will write
        //list.forEach(i -> System.out.println(i));


        //https://www.youtube.com/watch?v=4e_RsZWdiSc
        //Why we need to specify i to print, we can use method reference
        //list.forEach(System.out::println);

        //list.forEach(i -> doubleIt(i));
        list.forEach(LambdaDemo::doubleIt);
    }

    public static void doubleIt(int i){
        System.out.println(i*2);
    }

}
