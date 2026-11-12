package workshop6;

/**
 * Workshop 6 - Exercise 2 (Hard)
 *
 * Modification of Exercise 1: the songs are now output in alphabetical
 * order. A bubble sort is used to sort the songs, and the artist array is
 * swapped at the same time so that the two parallel arrays stay in step.
 */
public class Exercise2SortedSongList {

    public static void main(String[] args) {

        String[] songs = {
            "Bohemian Rhapsody",
            "Hotel California",
            "Imagine",
            "Billie Jean",
            "Rolling in the Deep",
            "Shape of You",
            "Blinding Lights",
            "Someone Like You",
            "Smells Like Teen Spirit",
            "Wonderwall"
        };

        String[] artists = {
            "Queen",
            "Eagles",
            "John Lennon",
            "Michael Jackson",
            "Adele",
            "Ed Sheeran",
            "The Weeknd",
            "Adele",
            "Nirvana",
            "Oasis"
        };

        bubbleSortBySongTitle(songs, artists);
        printSongList(songs, artists);
    }

    /**
     * Bubble sort of the songs array in alphabetical order.
     *
     * Bubble sort compares every pair of neighbours and swaps them when they
     * are in the wrong order. One pass pushes the "largest" song to the end,
     * so each later pass can ignore one more element at the end.
     *
     * Every time two songs are swapped, the matching artists are swapped too,
     * otherwise the artist would no longer belong to its song.
     *
     * @param songs   song titles, sorted in place
     * @param artists artists, kept in step with the songs
     */
    public static void bubbleSortBySongTitle(String[] songs, String[] artists) {
        int n = songs.length;

        for (int pass = 0; pass < n - 1; pass++) {
            boolean swapped = false;

            for (int i = 0; i < n - 1 - pass; i++) {
                // compareToIgnoreCase() gives an A-Z order that ignores case
                if (songs[i].compareToIgnoreCase(songs[i + 1]) > 0) {

                    String tempSong = songs[i];
                    songs[i] = songs[i + 1];
                    songs[i + 1] = tempSong;

                    String tempArtist = artists[i];
                    artists[i] = artists[i + 1];
                    artists[i + 1] = tempArtist;

                    swapped = true;
                }
            }

            // no swap in this pass -> the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    /**
     * Prints the songs in their current (sorted) order.
     */
    public static void printSongList(String[] songs, String[] artists) {
        System.out.println("MY 10 FAVOURITE SONGS (ALPHABETICAL ORDER)");
        System.out.println("------------------------------------------");

        for (int i = 0; i < songs.length; i++) {
            System.out.printf("%2d. %-24s by %s%n", i + 1, songs[i], artists[i]);
        }

        System.out.println("------------------------------------------");
        System.out.println("Sorted with bubble sort (" + songs.length + " songs).");
    }
}
