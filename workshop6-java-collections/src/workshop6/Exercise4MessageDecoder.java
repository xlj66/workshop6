package workshop6;

/**
 * Workshop 6 - Exercise 4 (Easy)
 *
 * Decodes a coded message with the substitution key given in the workshop:
 *
 *   coded : a b c d e f g h i j k l m n o p q r s t u v w x y z
 *   plain : c r g z a v i b s d o e q f h u j x k l w m y n p t
 *
 * so 'a' decodes to 'c', 'b' decodes to 'r', 'c' decodes to 'g' and so on.
 *
 * "G tgsl Qefe."   decodes to   "I like Java."
 *
 * To decode a different message only the MESSAGE constant has to be changed
 * (a second message is included below to show this).
 */
public class Exercise4MessageDecoder {

    /** The coded alphabet, in order. */
    private static final String CODED_ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    /** The matching plain alphabet (row 2 of the key table). */
    private static final String PLAIN_ALPHABET = "crgzavibsdoeqfhujxklwmynpt";

    public static void main(String[] args) {

        // change this constant to decode a different message
        String codedMessage = "G tgsl Qefe.";

        System.out.println("MESSAGE DECODER");
        System.out.println("---------------");
        System.out.println("Key (coded -> plain):");
        System.out.println("  " + spaced(CODED_ALPHABET));
        System.out.println("  " + spaced(PLAIN_ALPHABET));
        System.out.println();
        System.out.println("Coded message    : " + codedMessage);
        System.out.println("Decoded message  : " + decode(codedMessage));
        System.out.println();

        // the same program, a different message - no other change needed
        String anotherMessage = "Qefe akttlazgkxi ebl npx.";
        System.out.println("Coded message    : " + anotherMessage);
        System.out.println("Decoded message  : " + decode(anotherMessage));
    }

    /**
     * Decodes one message: every letter is looked up in the key table,
     * everything that is not a letter (spaces, punctuation) is copied as is.
     * The case of the original letter is kept.
     */
    public static String decode(String message) {
        StringBuilder decoded = new StringBuilder(message.length());

        for (int i = 0; i < message.length(); i++) {
            char coded = message.charAt(i);

            int keyIndex = CODED_ALPHABET.indexOf(Character.toLowerCase(coded));

            if (keyIndex >= 0) {
                char plain = PLAIN_ALPHABET.charAt(keyIndex);
                char decodedChar = Character.isUpperCase(coded)
                        ? Character.toUpperCase(plain)
                        : plain;
                decoded.append(decodedChar);
            } else {
                decoded.append(coded);
            }
        }

        return decoded.toString();
    }

    /** Helper used only to print the key table with spaces between letters. */
    private static String spaced(String alphabet) {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < alphabet.length(); i++) {
            if (i > 0) {
                text.append(' ');
            }
            text.append(alphabet.charAt(i));
        }
        return text.toString();
    }
}
