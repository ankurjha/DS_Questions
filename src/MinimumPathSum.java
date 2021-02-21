import java.util.Arrays;

public class MinimumPathSum {

    public static long getMinimumSumPathCount = 0;
    public static long getMinimumSumPathCountDP = 0;

    public int getMinimumSumPath(int[][] arr, int row, int col){
        getMinimumSumPathCount++;

        if(arr == null || arr.length == 0){
            return 0;
        }
        if(row >= arr.length || col >= arr[0].length){
            return Integer.MAX_VALUE;
        }
        if(row == arr.length - 1 && col == arr[0].length - 1){
            //System.out.println("Returning arr["+row+"]["+col+"] = " + arr[row][col]);
            return arr[row][col];
        }

        /*int right = getMinimumSumPath(arr, row, col + 1);
        int down = getMinimumSumPath(arr, row + 1, col);

        System.out.println("Returning arr["+row+"]["+col+"] = " + arr[row][col] + " , right = "+right+" , down = "+down);

        int returnValue = arr[row][col] + Math.min(right, down);
        System.out.println("returnValue = "+returnValue);
        return returnValue;*/

        //THis line is equivalent to above code block
        return arr[row][col] + Math.min(getMinimumSumPath(arr, row, col + 1) , getMinimumSumPath(arr, row + 1, col));
    }

    public int getMinimumSumPathDP(int[][] arr, int[][] memoization, int row, int col){
        getMinimumSumPathCountDP++;

        if(arr == null || arr.length == 0){
            return 0;
        }
        if(row >= arr.length || col >= arr[0].length){
            return Integer.MAX_VALUE;
        }
        if(row == arr.length - 1 && col == arr[0].length - 1){
            //System.out.println("Returning arr["+row+"]["+col+"] = " + arr[row][col]);
            return arr[row][col];
        }

        if(memoization[row][col] == -1){
            memoization[row][col] = arr[row][col] + Math.min(getMinimumSumPathDP(arr, memoization, row, col + 1) , getMinimumSumPathDP(arr, memoization, row + 1, col));
        }
        return memoization[row][col];
    }

    public static void main(String[] args) {
        /*int arr[][] = { {1,3,1},
                        {2,3,2},
                        {4,3,1}};*/

        int arr[][] = {{3,8,6,0,5,9,9,6,3,4,0,5,7,3,9,3},{0,9,2,5,5,4,9,1,4,6,9,5,6,7,3,2},{8,2,2,3,3,3,1,6,9,1,1,6,6,2,1,9},{1,3,6,9,9,5,0,3,4,9,1,0,9,6,2,7},{8,6,2,2,1,3,0,0,7,2,7,5,4,8,4,8},{4,1,9,5,8,9,9,2,0,2,5,1,8,7,0,9},{6,2,1,7,8,1,8,5,5,7,0,2,5,7,2,1},{8,1,7,6,2,8,1,2,2,6,4,0,5,4,1,3},{9,2,1,7,6,1,4,3,8,6,5,5,3,9,7,3},{0,6,0,2,4,3,7,6,1,3,8,6,9,0,0,8},{4,3,7,2,4,3,6,4,0,3,9,5,3,6,9,3},{2,1,8,8,4,5,6,5,8,7,3,7,7,5,8,3},{0,7,6,6,1,2,0,3,5,0,8,0,8,7,4,3},{0,4,3,4,9,0,1,9,7,7,8,6,4,6,9,5},{6,5,1,9,9,2,2,7,4,2,7,2,2,3,7,2},{7,1,9,6,1,2,7,0,9,6,6,4,4,5,1,0},{3,4,9,2,8,3,1,2,6,9,7,0,2,4,2,0},{5,1,8,8,4,6,8,5,2,4,1,6,2,2,9,7}};

        int[][] memoization = new int[arr.length][arr[0].length];
        for (int[] ints : memoization) {
            Arrays.fill(ints, -1);
        }

        MinimumPathSum minimumPathSum = new MinimumPathSum();

        System.out.println(minimumPathSum.getMinimumSumPath(arr, 0, 0));
        System.out.println("getMinimumSumPathCount = "+getMinimumSumPathCount);

        System.out.println(minimumPathSum.getMinimumSumPathDP(arr, memoization, 0, 0));
        System.out.println("getMinimumSumPathCountDP = "+getMinimumSumPathCountDP);
    }
}
