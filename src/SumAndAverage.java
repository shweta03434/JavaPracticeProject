import java.util.Arrays;
import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {

        int[] arrayElements = ArrayListUtility.arraylist();
        int sum=functionToCalculateSum(arrayElements);
        int avg=functionToCalculateAverage( arrayElements);
        System.out.println("SUM= "+sum);
        System.out.println("Average= "+avg);
    }

    public static int functionToCalculateSum(int[] elements) {

        int sum = 0;
        for (int element : elements) {
            sum += element;
        }
        return sum;
    }

    public static int functionToCalculateAverage(int[] elements) {
        int sum=functionToCalculateSum(elements);
        int avg = sum/elements.length;

        return avg;
    }
}