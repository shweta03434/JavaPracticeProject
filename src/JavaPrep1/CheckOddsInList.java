package JavaPrep1;

public class CheckOddsInList {

    public static void main(String[] args) {
        int[] array={8,9,7};
        if(isCheckOdds(array))
            System.out.println("list contains Odds only");
        else System.out.println("list doesn't contain Odds only");
    }

    public static boolean isCheckOdds(int[] array){
        boolean b=false;
        for(int i=0;i< array.length;i++){
            if(array[i]%2!=0){
             b=true;
            }
        }
        return b;
    }


}
