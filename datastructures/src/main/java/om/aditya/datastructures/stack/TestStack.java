package om.aditya.datastructures.stack;

public class TestStack {

    public static void main(String[] args) {


        QueueUsingTwoStacks<String> queue = new QueueUsingTwoStacks<String>();
        queue.enqueu("first");
        queue.enqueu("second");
        queue.enqueu("tird");
        queue.enqueu("forth");
        System.out.println("dequeued-> " +queue.dequeu());
        System.out.println("dequeued-> " +queue.dequeu());
        System.out.println("dequeued-> " +queue.dequeu());
        queue.enqueu("5th");
        queue.enqueu("6th");
        System.out.println("dequeued-> " +queue.dequeu());
        System.out.println("dequeued-> " +queue.dequeu());
        System.out.println("dequeued-> " +queue.dequeu());
        System.out.println("dequeued-> " +queue.dequeu());
        System.out.println("dequeued-> " +queue.dequeu());

        FindBracketBalance f = new FindBracketBalance();
        if( f.checkBalanceBruteForce() ) System.out.println("balanced expression"); else System.out.println("Not balanced expression");; ;
    }
}
