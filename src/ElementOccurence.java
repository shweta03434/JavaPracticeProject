import java.util.Scanner;

public class ElementOccurence {
    public static void main(String[] args) {

        int[] arrayElements = ArrayListUtility.arraylist();
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the element to be searched in the array--");
        int search_element = sn.nextInt();
        int x=searchAnElement(arrayElements,search_element);
        System.out.println(search_element+ " found "+x+" times in the array");

    }

    public static int searchAnElement(int[] array, int ele) {
        int i = 0, occ = 0;boolean b=false;
        while (i < array.length) {
            if (array[i] == ele) {
                occ++;
               b=true;
            }
            i++;
        }

if(!b)
    System.out.println("Searching Element not found in the array");
return occ;
    }
}
