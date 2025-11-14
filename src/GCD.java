import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sn= new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int first=sn.nextInt();
        System.out.println("Enter the second number: ");
        int second= sn.nextInt();
        int gcd=gcd(first,second);
        System.out.println("GCD: "+gcd);
    }
    public static int gcd (int first,int second){
        int gcd=1;
        int i=2;
           int least=least(first,second);
           while(i<=least){
             if(first%i==0 && second%i==0){
                 gcd=i;
             }
               i++;
           }
        return gcd;
    }
    public static int least(int first,int sec){
        if(first < sec)
            return first;
        else
            return sec;
    }
}
