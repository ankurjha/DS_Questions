//https://www.youtube.com/watch?v=vBdo7wtwlXs
//https://www.geeksforgeeks.org/minimum-number-of-jumps-to-reach-end-of-a-given-array/
public class MinimumHops {
    public int hops(int[] compartment){
        if(compartment.length <= 1){
            return 0;
        }
        int jetpackThreshold = compartment[0];
        int hopRemaining = compartment[0];
        int totalHops = 1;
        for(int coach = 1; coach < compartment.length; coach++){
            if(coach == compartment.length - 1){
                return totalHops;
            }
            if(coach + compartment[coach] > jetpackThreshold){
                jetpackThreshold = coach + compartment[coach];
            }
            hopRemaining--;
            if(hopRemaining == 0){
                totalHops++;
                hopRemaining = jetpackThreshold - coach;
            }
        }
        return totalHops;
    }
    public static void main(String[] args) {
        MinimumHops minimumHops = new MinimumHops();
        int[] compartment = {2,3,1,1,3};
        System.out.println("minimumHops required : " + minimumHops.hops(compartment));
    }
}
