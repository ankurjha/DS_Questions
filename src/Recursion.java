public class Recursion {

    private int sum(int n){
        if(n <= 0){
            return 0;
        }
        return n + sum(n - 1);
    }

    public static void main(String args[]){
        Recursion recursion = new Recursion();
        System.out.println(recursion.sum(1));
    }

}
