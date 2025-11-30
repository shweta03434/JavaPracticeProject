public class ArraySorting {
    public static void main(String[] args) {

        int[] arrayElements = ArrayListUtility.arraylist();
        boolean inc = sortingArrayInIncreasingOrder(arrayElements);
        boolean dec = sortingArrayInDecreasingOrder(arrayElements);
        if (inc || dec) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
        public static boolean sortingArrayInIncreasingOrder(int[] array){
            boolean inc = true;
            int i = 1;
            while (i < array.length) {
                if (array[i] < array[i - 1]) {
                    inc = false;
                }
                i++;
            }
            return inc;
        }

        public static boolean sortingArrayInDecreasingOrder(int[] array){
            boolean dec = true;
            int i = 1;
            while (i < array.length) {
                if (array[i] > array[i - 1]) {
                    dec = false;
                }
                i++;
            }
            return dec;
        }
    }
