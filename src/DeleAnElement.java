import java.util.Arrays;
import java.util.Scanner;

public class DeleAnElement {
    public static void main(String[] args) {

        int[] arrayElements = ArrayListUtility.arraylist();
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the element to be deleted: ");
        int element = sn.nextInt();
        int[] newA = newArray(element, arrayElements);
        ArrayListUtility.displayArray(newA);
    }

    public static int[] newArray(int element, int[] array) {
        int occ = ElementOccurence.searchAnElement(array, element);
        if (occ == 0)
            return array;
        int size = array.length;
        int newSize = size - occ;
        int[] array1 = new int[newSize];
        int i = 0, j = 0;

        while (i < size) {
            if (array[i] != element) {
                array1[j] = array[i];
                j++;
            }
            i++;
        }
        return array1;

    }
}
