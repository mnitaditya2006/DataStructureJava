package om.aditya.datastructures.recursion;

public class BinarySequence {

    //System.out.println("aaa emter the binarysequence number : ")

    public static int numBinarySeq(int n) {

        if (n==0) return 0 ;
        else {
                if (n==1) return 2 ;
                else return 2*numBinarySeq(n-1);
        }

    }

    public static void main(String args[]) {

      System.out.println("totl binary sequences for 3 are: " +numBinarySeq(3)) ;

    }
}
