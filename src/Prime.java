import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        Scanner sn= new Scanner(System.in);
        System.out.println("Please enter the number you want to know is prime or not ");
        int num= sn.nextInt();
        boolean prime= isPrime(num);
        if(prime)
            System.out.println(num +" is a prime");
        else
            System.out.println(num +" is not a prime");
    }

    public static boolean isPrime(int num)
    {
        int i=2;
        while(i<num){
            if(num%i==0){
                return false;
            }

            i++;
        }
       return true;
    }

}
