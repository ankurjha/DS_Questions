public class NoOfIsland {

    public int countIsland(int island[][], int visited[][]){
        int islandCount = 0;
        for(int i=0; i<island.length; i++) {
            for (int j = 0; j < island[i].length; j++) {
                if(island[i][j] == 1 && visited[i][j] == 0){
                    islandCount++;
                    checkIsland(island, visited, i, j);
                }

            }
        }
        return islandCount;
    }

    public void checkIsland(int island[][], int visited[][], int row, int col){
        if(row >= island.length){
            return;
        }
        if(col >= island[row].length){
            return;
        }
        if(island[row][col] == 1 && visited[row][col] == 0){
            visited[row][col] = 1;
            checkIsland(island, visited, row+1, col);
            checkIsland(island, visited, row, col+1);
        }
    }

    public static void main(String[] args) {
        /*int island[][] = {   {0,0,0},
                             {1,1,0},
                             {1,1,0},
                             {0,0,1},
                             {0,0,1},
                             {1,1,0}
                         };*/

        int island[][] = {
                {1,0,0,0,0,0},
                {1,0,1,1,1,1},
                {0,0,0,0,0,0},
                {1,1,1,0,1,1},
                {1,1,1,0,1,1},
                {0,0,0,0,1,1}
        };


        int visited[][] = new int[island.length][island[0].length];
        printArr(visited);

        NoOfIsland noOfIsland = new NoOfIsland();
        System.out.println("Island count = " + noOfIsland.countIsland(island, visited));

        printArr(visited);
    }

    public static void printArr(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
