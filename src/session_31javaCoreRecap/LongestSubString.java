package session_31javaCoreRecap;

public class LongestSubString {

    public static void main(String[] args) {

        String word = "abcabcbb";
        int maxLength = 0;
        for (int i = 0; i < word.length(); i++) {
            String substring = "";
            for (int substringIndex = 0; substringIndex < word.length() - i ; substringIndex++) {
                char currentChar = word.charAt(i + substringIndex);
                if(substring.indexOf(currentChar) < 0){
                    substring += currentChar;
                }
                else {
                    maxLength = Math.max(maxLength,substring.length());
                    break;
                }
            }
        }
        System.out.println(maxLength);
    }
}
