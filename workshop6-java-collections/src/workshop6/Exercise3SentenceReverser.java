package workshop6;

/**
 * Workshop 6 - Exercise 3 (Medium)
 *
 * Reverses the sequence of letters in each word of a sentence, using loops
 * and arrays.
 *
 * "To be or not to be."  becomes  "oT eb ro ton ot eb."
 *
 * Punctuation stays where it was: the letters of a word are reversed but
 * characters that are not letters (full stops, commas, question marks ...)
 * keep their original position. That is why "be." becomes "eb." and not ".eb".
 */
public class Exercise3SentenceReverser {

    public static void main(String[] args) {

        String[] sentences = {
            "To be or not to be.",
            "Hello, World!",
            "The quick brown fox jumps over the lazy dog."
        };

        for (int i = 0; i < sentences.length; i++) {
            System.out.println("Sentence " + (i + 1));
            System.out.println("  original : " + sentences[i]);
            System.out.println("  reversed : " + reverseWords(sentences[i]));
            System.out.println();
        }
    }

    /**
     * Splits a sentence into words (arrays) and reverses every word.
     */
    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder(sentence.length());

        for (int i = 0; i < words.length; i++) {
            result.append(reverseWord(words[i]));

            // put the spaces back between the words
            if (i < words.length - 1) {
                result.append(' ');
            }
        }

        return result.toString();
    }

    /**
     * Reverses the letters inside one word, using a char array and two
     * indexes (one walking from the left, one from the right).
     * Non-letter characters are skipped, so punctuation does not move.
     */
    public static String reverseWord(String word) {
        char[] letters = word.toCharArray();
        int left = 0;
        int right = letters.length - 1;

        while (left < right) {
            if (!isLetter(letters[left])) {
                left++;
            } else if (!isLetter(letters[right])) {
                right--;
            } else {
                char temp = letters[left];
                letters[left] = letters[right];
                letters[right] = temp;
                left++;
                right--;
            }
        }

        return new String(letters);
    }

    private static boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }
}
