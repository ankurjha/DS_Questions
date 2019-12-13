// https://codegolf.stackexchange.com/questions/160242/john-the-gambler

public class Casino_chips {

    public static void main(String arr[]){
        System.out.print("djd");
        Casino casino = new Casino();
        casino.play(17, 4, 0);
        casino.playIterative(17, 4, 0);
        casino.sol(17, 4, 0);
        System.out.println("minimumChance D = "+casino.sol(18, 2, 0));

    }
}

class Casino{

    int play(int totalChips, int totalAllIns, int minimumChance){
        if(totalChips == 1){
            System.out.println("minimumChance R = "+minimumChance);
            return minimumChance;
        }else if(totalChips%2>0 || totalAllIns<1){
            return play(totalChips-1, totalAllIns, minimumChance+1);
        }else{
            return play(totalChips/2, totalAllIns-1, minimumChance+1);
        }
    }

    void playIterative(int totalChips, int totalAllIns, int minimumChance){
        while(totalChips > 1){
            if(totalChips%2>0 || totalAllIns < 1){
                totalChips = totalChips - 1;
            }else{
                totalChips = totalChips/2;
                totalAllIns = totalAllIns - 1;
            }
            minimumChance = minimumChance + 1;
        }
        System.out.println("minimumChance I = "+minimumChance);
    }

    int sol(int N, int K, int ctr) {

        if (K == 0) {
            return N-1;
        }

        if (N == 1) {
            return ctr;
        }
        if ( K == ctr || N/2 <= 1) {
            if (N == 1) {
                return ctr;
            } else {
                for (int i = N; i > 0 ; i--) {
                    ctr++;
                }
                return ctr;
            }
        } else {
            ctr +=1;

            return sol(N/2, K, ctr);
        }

    }
}
