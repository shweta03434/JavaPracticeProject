import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sn.nextInt();
        boolean armstrong = isArmstrong(num);
        if (armstrong)
            System.out.println(num + " is armstrong");
        else
            System.out.println(num + " is not armstrong");
    }

    public static boolean isArmstrong(int num) {
        int numCopy = num;
        int numberOfDigits = digitCount(num);
        int sumOfDigits = 0;
        while (num > 0) {
            int digit = num % 10;
            num = num / 10;
            sumOfDigits += pow(digit, numberOfDigits);
        }
        return sumOfDigits == numCopy;
    }

    //calculate no. of digits in the number
    public static int digitCount(int num) {
        int i = 0;
        while (num > 0) {
            i++;
            num = num / 10;
        }
        return i;
    }

    /// 2^3=2*2*2
    public static int pow(int num1, int num2) {
        int i = 0;
        int result = 1;
        while (i < num2) {
            result *= num1;
            i++;
        }
        return result;
    }
}
