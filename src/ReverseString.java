import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] word = {'h', 'e', 'l', 'l', 'o'};
        reverseString(word);
        System.out.println(Arrays.toString(word));
    }
    static void reverseString(char[] s) {
        for(int i=0; i<s.length/2; i++){
            char temp = s[i];
            s[i] = s[s.length-i-1];
            s[s.length-i-1] = temp;
        }
    }
}
