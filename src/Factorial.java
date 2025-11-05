import java.util.Scanner;

public class Factorial {

    public static void main(String[] args){

        Scanner sn= new Scanner(System.in);
        System.out.println("Please enter the number for which you want the factorial value: ");
        int num= sn.nextInt();
         long fact= factorial(num);
        System.out.println("factorial value: "+fact);
    }

    public static long factorial(int num){
  long fact=1;

        if(num<2)
            return 1;
        else {
            for(int i=1;i<=num;i++){

                fact= fact* i;
            }
            return fact;
        }
    }
}
