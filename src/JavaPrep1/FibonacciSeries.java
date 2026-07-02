package JavaPrep1;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num=3;
        System.out.println("Number of terms: "+num);
        int first=0;int second=1;
        int next=0;
        for(int i=1;i<=num;i++){
            System.out.print(first+ " ");
            next=first+second;
            second=first;
            first=next;
        }
    }
}
