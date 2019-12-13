import java.util.*;

public class RandomNumber {

    public static void main(String[] args){
        /*Random random = new Random();
        int min = 0, max = 5;
        for(int i=0;i<500;i++){
            int value = random.nextInt(max - min);
            if(value == 5){
                System.out.println("sdkjfhjksjdfskjfsdjk");
            }
            System.out.println(value);
        }*/

        Long[] sdj={};

        List<Long> ids = Arrays.asList(sdj);
        /*ids.add(676l);
        ids.add(678l);
        ids.add(888l);*/
        System.out.println(ids);

        //List<String> articleHighlight = Arrays.asList(articleDetailResponseBean.getArticleHighlight().split("\\s*</BR>\\s*"));
        ListIterator<Long> iterator = ids.listIterator();
        while(iterator.hasNext()){
            long str = iterator.next();
            if(str == 678l){
                iterator.remove();
            }
        }

        System.out.println(ids);

    }
}
