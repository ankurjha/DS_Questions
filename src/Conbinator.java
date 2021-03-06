public class Conbinator {

    public static void main(String arr[]){
        long count = 0;
        int n = 39 ;
        int r =4 ;
        long[] a = new long[r];
// initialize first combination
        for (int i = 0; i < r; i++) {
            a[i] = i;
        }
        int i = r - 1; // Index to keep track of maximum unsaturated element in array
// a[0] can only be n-r+1 exactly once - our termination condition!
        while (a[0] < n - r + 1) {
            // If outer elements are saturated, keep decrementing i till you find unsaturated element
            while (i > 0 && a[i] == n - r + i) {
                i--;
            }
            //printArray(a); // pseudo-code to print array as space separated numbers
            for(long g : a){
                //System.out.print(g +" ");
                count++;
            }
            //System.out.println("Count = "+count);
            a[i]++;
            // Reset each outer element to prev element + 1
            while (i < r - 1) {
                a[i + 1] = a[i] + 1;
                i++;
            }
        }
        System.out.println("Count = "+count);
    }


}
