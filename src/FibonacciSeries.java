import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the number for which you want fibonacci series : ");
        int num = sn.nextInt();
        System.out.println("Fibonacci Series: ");
        fibonacci(num);
    }

    public static void fibonacci(int num) {
        if (num < 0) return;
        System.out.print("0 ");
        if (num == 0) return;
        System.out.print("1 ");
        int first=0, second=1;
        while(first+second<num){
            int third=first+second;
            System.out.print(third+" ");
            first=second;
            second=third;
        }
    }

}

