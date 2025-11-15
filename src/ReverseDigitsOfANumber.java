import java.util.Scanner;

public class ReverseDigitsOfANumber {

    public static void main(String[] args) {

        Scanner sn= new Scanner(System.in);
        System.out.println("Enter the number you want to reverse: ");
        int num= sn.nextInt();
         int reverse= reverse(num);
        System.out.println("On reversing digits,new number = "+reverse);
    }

    public static int reverse(int num){

        int newNum=0;
        while(num>0){
            int digit= num%10;
            newNum=newNum*10+digit;
            num=num/10;

        }
        return newNum;
    }
}
