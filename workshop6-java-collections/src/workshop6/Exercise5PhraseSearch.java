package workshop6;

/**
 * Workshop 6 - Exercise 5 (Medium)
 *
 * Search engine: searches a phrase in an array of 10 paragraphs taken from
 * a book. The paragraphs are stored in an array of Strings and String.contains()
 * is used for the search.
 *
 * If the phrase is found, the index and the paragraph are printed for every
 * match. If the phrase is not found, a message saying so is printed.
 */
public class Exercise5PhraseSearch {

    private static final String[] PARAGRAPHS = {
        "Lose all the weight you want.",
        "I can't I must work",
        "That would be like a keyword search.",
        "This would be Victoria.",
        "Join the party.",
        "To be or not to be.",
        "That is a question to test keyword search.",
        "Can you find a needle in a hay stack?",
        "This could be the last paragraph, but its not.",
        "Ada Lovelace is the worlds first programmer as of 1860."
    };

    public static void main(String[] args) {
        System.out.println("PARAGRAPH SEARCH ENGINE");
        System.out.println("=======================");
        System.out.println("The book contains " + PARAGRAPHS.length + " paragraphs.");
        System.out.println();

        // a phrase that appears twice
        search("keyword search");
        // a phrase that appears once
        search("Ada Lovelace");
        // a phrase that does not appear at all
        search("Harry Potter");
    }

    /**
     * Searches for a phrase in every paragraph and prints the result.
     * The search ignores upper/lower case.
     *
     * @param phrase the phrase to look for
     * @return the number of paragraphs that contained the phrase
     */
    public static int search(String phrase) {
        System.out.println("Searching for: \"" + phrase + "\"");
        String lowerPhrase = phrase.toLowerCase();
        int matches = 0;

        for (int i = 0; i < PARAGRAPHS.length; i++) {
            if (PARAGRAPHS[i].toLowerCase().contains(lowerPhrase)) {
                matches++;
                System.out.println("  Match " + matches + " found at array index "
                        + i + ":");
                System.out.println("    " + PARAGRAPHS[i]);
            }
        }

        if (matches == 0) {
            System.out.println("  The phrase \"" + phrase
                    + "\" was NOT found in any paragraph.");
        } else {
            System.out.println("  " + matches + " paragraph(s) contained the phrase.");
        }

        System.out.println();
        return matches;
    }
}
