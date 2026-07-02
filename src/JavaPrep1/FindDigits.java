package JavaPrep1;

public class FindDigits {
    public static void main(String[] args) {

        String input="ABCD%%^67 7JJJll_+";
int count=0;
        for(int i=0;i<input.length();i++){
            if(Character.isDigit(input.charAt(i))){
                count++;
            }
        }
        System.out.println("Total no. of digits= "+count);
    }
}


//Character.isDigit(input.charAt(i));
//Character.isDigit(input.charAt(i)