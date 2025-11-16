import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sn= new Scanner(System.in);
        System.out.println("Please enter a number you want to know is palindrome or not");
        int num= sn.nextInt();
        if(isPalindrome(num))
            System.out.println("Number is palindrome");
        else System.out.println("Number is not palindrome");
    }

    public static boolean isPalindrome(int num){
        int copyNum=num;
        int reverse=reverse(num);
        return copyNum==reverse;
    }

    public static int reverse(int num){
        int digit=0;
        int reverseDigit=0;
        while(num>0){
            digit=num%10;
            reverseDigit=reverseDigit*10+digit;
            num/=10;
        }
        System.out.println("reverse: "+reverseDigit);
        return reverseDigit;
    }
}
