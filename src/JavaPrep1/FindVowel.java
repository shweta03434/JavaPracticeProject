package JavaPrep1;

public class FindVowel {
    public static void main(String[] args) {
        String text="Shweta";
        findVowel(text);
    }

    public static void findVowel(String text){

        char[] textArray =text.toCharArray() ;
        for(char ch:textArray){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                System.out.println("Vowel present in the String");
                break;
            }

        }

    }
}
