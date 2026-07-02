package JavaPrep1;

public class ProblemStmt2 {
    public static void main(String[] args) {
        String str = "A man,a plan, a canal:Panama"; //
        //ignoring special char and identify the string is palindrome
        str =str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String reversed= new StringBuilder(str).reverse().toString();
        System.out.println("reversed-->"+reversed);
        if(str.equals(reversed)){
            System.out.println("Palindrome");
        }else{
            System.out.println("not a Palindrome");
        }

    }
}
