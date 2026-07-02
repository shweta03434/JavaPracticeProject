package JavaPrep1;

public class MissingNumber {

    public static void main(String[] args) {

        int[] array={1,2,4,5,6};
        int n=array.length+1;
        System.out.println("n="+n);
        int sum1=n*(n+1)/2;
        System.out.println("sum1="+sum1);
        int missing=0;
        int sum2=0;
        for(int i=0;i<n-1;i++){
            sum2+=array[i];
        }
        System.out.println("sum2="+sum2);
        missing= sum1-sum2;
        System.out.println("Missing number="+missing);
    }
}
