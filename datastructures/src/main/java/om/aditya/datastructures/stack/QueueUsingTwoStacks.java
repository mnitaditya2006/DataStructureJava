package om.aditya.datastructures.stack;

public class QueueUsingTwoStacks<T> {

    ArrayStack<T>  dequeuStack = new ArrayStack<T>();
    ArrayStack<T>  enqueuStack = new ArrayStack<T>();

    public void enqueu(T e) {

        enqueuStack.push(e);
        System.out.println("pushed->" +e);
    }

    public T dequeu() {

        if(enqueuStack.isEmpty() && dequeuStack.isEmpty()) throw new IndexOutOfBoundsException("Empty quue--");

        if(dequeuStack.isEmpty()) {

            while(!enqueuStack.isEmpty()) {dequeuStack.push(enqueuStack.pop()) ; }
        }

        return dequeuStack.pop();


    }


}
