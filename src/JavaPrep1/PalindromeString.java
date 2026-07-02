package JavaPrep1;

public class PalindromeString {
    public static void main(String[] args) {
        String str="ABB";
        String reverse=reverseString(str);
        if(reverse.equals(str))
            System.out.println(str+" is a Palindrome");
        else
            System.out.println(str+" is not a Palindrome");
    }


    public static String reverseString(String str){
        String reverseStr="";
        for(int i=str.length()-1;i>=0;i--){
            reverseStr= reverseStr+ str.charAt(i);
        }
        return reverseStr;
    }
}
