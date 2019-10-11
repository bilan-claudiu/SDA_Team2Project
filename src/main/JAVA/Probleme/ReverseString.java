package main.JAVA.Probleme;

public class ReverseString {
    public static String Oglinda(String str) {
        String cuvinte[]=str.split("\\s");
        for(int i=cuvinte.length-1; i>=0; i--) {
            System.out.print(cuvinte[i] + "\t");
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.print(Oglinda("hello cat"));
    }
}


/* * Given an input string, reverse the string word by word.
 * <p>
 * <b>Example:</b>
 * <pre>
 * <b>Input:</b> "the sky is blue",
 * <b>Output:</b> "blue is sky the".
 * </pre>
 * <p>
 * <b>Note:</b>
 * <ul>
 * <li>A word is defined as a sequence of non-space characters.</li>
 * <li>Input string may contain leading or trailing spaces. However, your reversed string should not contain leading or trailing spaces.</li>
 * <li>You need to reduce multiple spaces between two words to a single space in the reversed string.</li>
 * </ul>
 * <p>
*/