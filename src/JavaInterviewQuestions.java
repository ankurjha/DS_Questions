public class JavaInterviewQuestions {

    public static void main(String args[]){
        /*int a = 0;
        int b = 5;
        b = a;
        System.out.println(b);

        Integer a1=null;
        Integer b1 = 5;
        b = a1;
        System.out.println(b);*/

        Integer i =128;
        Integer j=128;

        if(i==j){
            System.out.println("first = "+true);
        }else{
            System.out.println("first = "+false);
        }

        if(i==j){
            System.out.println("second = "+true);
        }else{
            System.out.println("second = "+false);
        }

        if(i==j){
            System.out.println("third = "+true);
        }else{
            System.out.println("third = "+false);
        }

        Integer q = new Integer(50);
        Integer p = 50;

        if(p==q){
            System.out.println("forth = "+true);
        }else{
            System.out.println("forth = "+false);
        }

        if(p==q){
            System.out.println("fifth = "+true);
        }else{
            System.out.println("fifth = "+false);
        }


    }
}
