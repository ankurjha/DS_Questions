public class TowerOfHanoi {
    private void swapDisk(String place, int n, char from_rod, char to_rod, char temp_rod){
        System.out.println("swapDisk called for n = "+ n + " , method = "+place+" , from_rod = "+from_rod + " , to_rod = "+to_rod+" , temp_rod = "+temp_rod);
        if(n>0){
            swapDisk("Top",n-1,from_rod, temp_rod, to_rod);
            System.out.println("Moving disk = "+ n + " , from = "+from_rod + " , to = "+to_rod);
            swapDisk("Bottom",n-1,temp_rod, to_rod, from_rod);
            System.out.println("Returning for n = "+n);
        }
    }

    public static void main(String args[]){
        TowerOfHanoi towerOfHanoi = new TowerOfHanoi();
        towerOfHanoi.swapDisk("Main",3, 'A','C','B');
    }
}
