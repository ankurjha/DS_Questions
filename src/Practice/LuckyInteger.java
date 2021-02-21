//https://leetcode.com/problems/find-lucky-integer-in-an-array/
package Practice;

public class LuckyInteger {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,2,3,3,3};
        LuckyInteger luckyInteger = new LuckyInteger();
        System.out.println("Lucky Number : " + luckyInteger.findLucky(arr));
    }

    public int findLucky(int[] arr) {
        int count[] = new int[501];
        for(int i=0; i<arr.length; i++){
            count[arr[i]] = count[arr[i]] + 1;
        }
        for(int i = count.length - 1; i>0; i--){
            if(i == count[i]){
                return i;
            }
        }
        return -1;
    }
}
