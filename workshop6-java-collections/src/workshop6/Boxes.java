package workshop6;

/**
 * Workshop 6 - Exercise 7 (Medium)
 *
 * A class that draws square boxes on the console.
 *
 * A box of size n has n rows and n columns:
 *   - the top and bottom rows are drawn with '-'
 *   - the left and right columns are drawn with '|'
 *   - the inside of the box is filled with spaces
 *
 * The class provides:
 *   - a constructor that accepts the size of the box
 *   - setSize(), which sets the size of the box
 *   - toString(), which returns the size as a String, e.g. "10 x 10"
 *   - draw(), which draws the box on the screen
 *
 * Extension: drawUnicode() uses the Unicode characters \u2500 and \u2502.
 */
public class Boxes {

    /** The biggest box that can be drawn, as required by the workshop. */
    public static final int MAX_SIZE = 10;

    /** The smallest box that still looks like a box. */
    public static final int MIN_SIZE = 2;

    private int size;

    /**
     * Creates a box of the given size.
     *
     * @param size the width and height of the box, 2 to 10
     */
    public Boxes(int size) {
        setSize(size);
    }

    /**
     * Sets the size of the box.
     *
     * @param size the width and height of the box, 2 to 10
     * @throws IllegalArgumentException if the size is out of range
     */
    public void setSize(int size) {
        if (size < MIN_SIZE || size > MAX_SIZE) {
            String message = "Box size must be between " + MIN_SIZE + " and " + MAX_SIZE
                    + " - got " + size;
            throw new IllegalArgumentException(message);
        }
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    /** @return the size of the box as a String, for example "10 x 10" */
    @Override
    public String toString() {
        return size + " x " + size;
    }

    /** Draws the box on the console with '-' and '|'. */
    public void draw() {
        draw('-', '|');
    }

    /** Draws the box using the Unicode box-drawing characters \u2500 and \u2502. */
    public void drawUnicode() {
        draw('\u2500', '\u2502');
    }

    /**
     * Draws the box with the two characters supplied.
     *
     * @param horizontal character used for the top and bottom lines
     * @param vertical   character used for the left and right sides
     */
    public void draw(char horizontal, char vertical) {
        for (int row = 0; row < size; row++) {
            StringBuilder line = new StringBuilder(size);

            for (int col = 0; col < size; col++) {
                if (row == 0 || row == size - 1) {
                    line.append(horizontal);          // top and bottom edge
                } else if (col == 0 || col == size - 1) {
                    line.append(vertical);            // left and right edge
                } else {
                    line.append(' ');                 // empty inside
                }
            }

            System.out.println(line);
        }
    }
}
