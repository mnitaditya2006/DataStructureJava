package om.aditya.datastructures.recursion;

public class BinarySequenceWithoutConsicutiveZero {

    public  static int numBinarySeq(int n) {

        if (n==1) return 2 ;
         else {
            if (n==2) return 3;
            else return numBinarySeq(n-1) + numBinarySeq(n-2);
        }

    }

    public static void main(String args[]) {

        System.out.println("total binary sequences for 3 are: " +numBinarySeq(3)) ;

    }

}
