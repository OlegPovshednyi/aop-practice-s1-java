package h10;

public class task1  {
    public char kthCharacter(int k) {
        StringBuilder word = new StringBuilder("a");

        while (word.length() < k) {
            int size = word.length();

            for (int i = 0; i < size; i++) {
                char next = (char) (word.charAt(i) + 1);
                word.append(next);
            }
        }

        return word.charAt(k - 1);
    }
}
//link=https://leetcode.com/problems/find-the-k-th-character-in-string-game-i/
