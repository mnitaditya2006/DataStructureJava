package om.aditya.datastructures.stack;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Stack;

public class FindBracketBalance {

    String input = "(()[]}{d*(a+b)*c}{}[])" ;
    char[] in1 =  input.toCharArray();
    int currentSize = 0;


    public Boolean checkBalanceBruteForce()  {

        if(in1.length == 0 ) throw new InputMismatchException("Please provide input");
       ArrayStack<Character> processor = new ArrayStack<>();

        for(char e : in1) {
            if( e == '{' | e == '(' | e == '[' )
             {  processor.push(e);
             currentSize++ ;
             }
            else if(e == '}' | e== ']' | e == ')')
                {
                    if(processor.size() == 0 ) { return false;}

                     Character a  =  processor.pop();

                    if( ( a.equals('(')  && e == ')' )| ( a.equals('[')  && e == ']' ) | ( a.equals('{')  && e == '}' ) )
                         currentSize--;
                    else {  return false;}
                }

        }

        return true;



    }


}
