package JavaPrep1;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1="listen";
        String str2="silent";
        str1=str1.replaceAll("//s","").toLowerCase();
        str2=str2.replaceAll("//s","").toLowerCase();

        if (str1.length() == str2.length()) {
           return;
        }

        char[] str1Array= str1.toCharArray();
        char[] str2Array=str2.toCharArray();

        Arrays.sort(str1Array);
        Arrays.sort(str2Array);

        System.out.println("String is not an anagram");

    }
}
