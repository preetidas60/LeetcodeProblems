import java.util.HashSet;

public class CheckIfPanagram {
    public static void main(String[] args) {
        String name = "acdefghijklmnopqrstuvwxyzb";
        System.out.println(checkIfPangram(name));
    }
    static boolean checkIfPangram(String sentence) {
        HashSet<Character> mySet = new HashSet<>();
        for(int i='a'; i<='z'; i++){
            mySet.add((char)i);
        }
        for(int i=0; i<sentence.length(); i++){
            mySet.remove(sentence.charAt(i));
            if(mySet.isEmpty()) return true;
        }
        return false;
    }

//    Efficient code
//    static boolean checkIfPangram(String sentence) {
//            boolean[] letters  = new boolean[26];
//
//            for(char c : sentence.toCharArray()) {
//                letters[c - 'a'] = true;
//            }
//
//            //find any letter that not exist
//            for(boolean existLetter : letters) {
//                if(!existLetter) return false;
//            }
//
//            return true;
//        }
}
