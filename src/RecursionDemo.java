import java.util.Arrays;

public class RecursionDemo {

    public static int count = 0;
    public static int countForMemoization = 0;

    public int naturalNumberSum(int n){
        if(n == 1){
            return n;
        }
        return naturalNumberSum(n - 1) + n;
    }

    public int exponent(int m , int n){
        if(n == 1){
            return m;
        }
        return exponent(m,n - 1) * m;
    }

    public int fibonacci(int n){
        count++;
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public int fibonacciWithMemoization(int n, int[] memoization){
        countForMemoization++;
        if(n == 0){
            memoization[n] = 0;
            return 0;
        }
        if(n == 1){
            memoization[n] = 1;
            return 1;
        }
        if(memoization[n-1] == -1){
            memoization[n-1] = fibonacciWithMemoization(n - 1, memoization);
        }

        if(memoization[n-2] == -1){
            memoization[n-2] = fibonacciWithMemoization(n - 2, memoization);
        }
        memoization[n] = memoization[n-1] + memoization[n-2];
        return memoization[n];
    }

    public static void main(String[] args) {
        RecursionDemo recursionDemo =  new RecursionDemo();
        System.out.println("naturalNumberSum = "+recursionDemo.naturalNumberSum(5));
        System.out.println("exponent = "+recursionDemo.exponent(3, 4));

        int n = 22;
        int[] memoization = new int[n+1];
        Arrays.fill(memoization, -1);
        System.out.println("fibonacciWithMemoization = "+recursionDemo.fibonacci(n)+" , count = "+count);
        System.out.println("fibonacciWithMemoization = "+recursionDemo.fibonacciWithMemoization(n, memoization)+" , countForMemoization = "+countForMemoization);
        for(int i: memoization){
            System.out.print(i+" , ");
        }
    }
}
