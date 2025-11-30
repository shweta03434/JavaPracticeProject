public class MinMaxElements {
    public static void main(String[] args) {
        int[] arrayelements = ArrayListUtility.arraylist();
        int min=findMinElementInTheArray(arrayelements);
        int max=findMaxElementInTheArray(arrayelements);
        System.out.println("largest no. is- " + max);
        System.out.println("smallest no. is- " + min);
    }

    public static int findMinElementInTheArray(int[] array) {
        int smallest = Integer.MAX_VALUE;
        int i = 0;
        while (i < array.length) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
            i++;
        }
        return smallest;
    }

    public static int findMaxElementInTheArray(int[] array) {
        int largest = Integer.MIN_VALUE;
        int i = 0;
        while (i < array.length) {
            if (array[i] > largest) {
                largest = array[i];
            }
            i++;
        }
        return largest;
    }
}
