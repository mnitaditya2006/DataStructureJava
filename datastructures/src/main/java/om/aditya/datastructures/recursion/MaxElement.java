package om.aditya.datastructures.recursion;

public class MaxElement {

    public static int maxElement(int[] a) {

        return max(a,0,a.length-1);

    }


    public static int max(int[] a , int l, int u) {

        if(l==u) return a[l];
        else {
            int mid = (l + u) / 2;
            int max1 = max(a,l,mid);
            int max2 = max(a,mid+1,u);
            if(max1>max2) return max1 ; else return max2;
        }

    }

    public static void main(String args[]) {

       // int[] b = [1,3,4,5,6,7,8,9] ;
        System.out.println("max number from array {1,23,4,67,89,12,34,56,90}: " +maxElement(new int[]{1,23,4,67,89,12,34,56,90} )) ;

    }
}
