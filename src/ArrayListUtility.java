import java.util.Arrays;
import java.util.Scanner;

public class ArrayListUtility {
    public static void main(String[] args) {
        arraylist();

    }
    public static int[] arraylist(){
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sn.nextInt();
        System.out.println("Enter the elements of an array: ");
        int[] nums=new int[size];
        int i = 0;
        while (i < size) {
            System.out.println("Enter element for position " + i + " :");
            nums[i] = sn.nextInt();
            i++;
        }
        return nums;
    }

    public static void displayArray(int[] nums){

        int i = 0;int j=0;
        int[] newArray= new int[nums.length];
        while (i < nums.length) {
            newArray[j]= nums[i];
            i++;j++;
        }
        System.out.println(Arrays.toString(newArray));
    }
}
