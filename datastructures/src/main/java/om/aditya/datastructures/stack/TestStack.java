package om.aditya.datastructures.stack;

public class TestStack {

    public static void main(String[] args) {


        QueueWithoneStack<String> queue = new QueueWithoneStack<String>();
        queue.Enqueu("first");
        queue.Enqueu("second");
        queue.Enqueu("tird");
        queue.Enqueu("forth");
        System.out.println("dequeued-> " +queue.Dequeu());
        System.out.println("dequeued-> " +queue.Dequeu());
        System.out.println("dequeued-> " +queue.Dequeu());
        queue.Enqueu("5th");
        queue.Enqueu("6th");
        System.out.println("dequeued-> " +queue.Dequeu());
        System.out.println("dequeued-> " +queue.Dequeu());
        System.out.println("dequeued-> " +queue.Dequeu());
        System.out.println("dequeued-> " +queue.Dequeu());
        System.out.println("dequeued-> " +queue.Dequeu());

        FindBracketBalance f = new FindBracketBalance();
        if( f.checkBalanceBruteForce() ) System.out.println("balanced expression"); else System.out.println("Not balanced expression");; ;
    }
}
