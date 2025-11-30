public class ArrayReversal {
    public static void main(String[] args) {

        int[] arrayElements= ArrayListUtility.arraylist();;
        int[] reverseArray= newArrayReversal(arrayElements);
        ArrayListUtility.displayArray(reverseArray);

    }
    public static int[] newArrayReversal(int[] array){

        int i=0;
        int swap=0;
        while(i<array.length/2){
           swap=array[i];
           array[i]= array[(array.length-1)-i];
            array[(array.length-1)-i]=swap;
i++;
        }
        return array;
    }
}
