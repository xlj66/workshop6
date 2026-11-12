package workshop6;

/**
 * Workshop 6 - Exercise 1 (Easy)
 *
 * Stores the names of 10 favourite songs in one array of Strings and the
 * matching artist names in a second array of Strings, then outputs the
 * complete list of songs and artists.
 *
 * The two arrays are "parallel": element i of the songs array belongs to
 * element i of the artists array.
 */
public class Exercise1SongList {

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

        printSongList(songs, artists);
    }

    /**
     * Prints every song together with the artist who recorded it.
     */
    public static void printSongList(String[] songs, String[] artists) {
        System.out.println("MY 10 FAVOURITE SONGS");
        System.out.println("---------------------");

        for (int i = 0; i < songs.length; i++) {
            System.out.printf("%2d. %-24s by %s%n", i + 1, songs[i], artists[i]);
        }

        System.out.println("---------------------");
        System.out.println("Number of songs stored: " + songs.length);
        System.out.println("Number of artists stored: " + artists.length);
    }
}
