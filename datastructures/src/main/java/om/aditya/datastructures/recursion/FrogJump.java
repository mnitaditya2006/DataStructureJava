package om.aditya.datastructures.recursion;
//there s a frog standin on one side of the river and there are "n" stones on which he can jump to reach another side of the
//river..he can either jump 1 or 2 stones in one jump...how many ways can he reach to the other side
public class FrogJump {

    public static int numJumps(int numStones) {

        if (numStones ==1 ) return 1 ;
        else if (numStones == 2) return 2 ;
            else return numJumps(numStones -1) + numJumps(numStones - 2) ;

    }


    public static void main(String args[]) {

        System.out.println("Totaljums needed for 5 stnes are: " +numJumps(3));
    }
}
