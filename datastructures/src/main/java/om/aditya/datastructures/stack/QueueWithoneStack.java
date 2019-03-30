package om.aditya.datastructures.stack;

import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;

public class QueueWithoneStack<T> {

    ArrayStack<T> s = new ArrayStack<T>();

    public void Enqueu(T e) {

        s.push(e);
        System.out.println("pushed->" +e);
    }


    public T Dequeu() {

        if(s.isEmpty()) throw new IndexOutOfBoundsException("Empty Queue....");
        if(s.size() == 1) return s.pop() ;
        else {

            T temp = s.pop() ;
            T lastEle = Dequeu();
            s.push(temp);
            return lastEle;
        }


    }

}
