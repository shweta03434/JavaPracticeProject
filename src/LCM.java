import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber= sn.nextInt();
        System.out.println("Enter the second number: ");
        int secNumber= sn.nextInt();
        int lcm=lcm(firstNumber,secNumber);
        System.out.println("LCM: "+lcm);
    }

    public static int lcm(int first,int sec){

        int i=1;
        while(i<=sec){
            int factor=first*i;
            if(factor%sec==0)
                return factor;
            i++;
        }
        return 0;
    }
}
