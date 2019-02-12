package om.aditya.datastructures.recursion;

public class SwapFirstLast {

    int number ;

    SwapFirstLast(int num) {

        this.number = num;
    }

    int numDigits ;

    /*
    = calculateNumDigits(number);
 */

    public int calculateNumDigits(int num) {
        int i = 1 ;
        while(num/10 >= 10 ) {

            i++;
            num = num/10;
        }

        return i;
    }



    public int swapDigits(int num , int numDigits) {

        if(numDigits <=1 ) return num ;



       int firstDigit = ( num/ (int)Math.pow(10 , numDigits)  ) *  (int)Math.pow(10 , numDigits);
        int lastDigit =  (num%10) ;

        int newNum = firstDigit + lastDigit * (int)Math.pow(10 , numDigits-1) ;

        num =  ( num - (firstDigit + lastDigit) ) / 10;

        return newNum + swapDigits(num , numDigits-2) ;
    }


    public  static void main(String[] args) {

        SwapFirstLast s = new SwapFirstLast(11000);

        int numDigits = s.calculateNumDigits(s.number);

      System.out.println(+numDigits);

      System.out.println( s.swapDigits( s.number , numDigits));
    }

}
