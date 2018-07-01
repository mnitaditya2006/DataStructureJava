package Algorithms.datastructures;

import om.aditya.datastructures.stack.ArrayStack;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ArrayStack<String> stack= new ArrayStack<String>();
        for(int i = 0 ; i < 15 ; i++ ) 
        { 
        	stack.push("a"+i);
        	System.out.println(stack.peek() +" length " +stack.items.size());
        }
        
    }
}
