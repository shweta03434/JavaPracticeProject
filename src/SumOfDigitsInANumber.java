import java.util.Scanner;

public class SumOfDigitsInANumber {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sn.nextInt();
        int sum_of_digits = sum(num);
        System.out.println("Sum of digits of a number: " + sum_of_digits);
    }

    public static int sum(int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum + (num % 10);
            num = num / 10;
        }
        return sum;
    }
}
