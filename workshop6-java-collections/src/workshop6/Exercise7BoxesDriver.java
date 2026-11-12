package workshop6;

/**
 * Workshop 6 - Exercise 7 (Medium) - driver class.
 *
 * Contains main() and tests the Boxes class: it draws two boxes of
 * different sizes, shows the toString() result, uses setSize(), and
 * demonstrates the Unicode extension and the range check.
 */
public class Exercise7BoxesDriver {

    public static void main(String[] args) {

        System.out.println("BOX DRAWING PROGRAM");
        System.out.println("===================\n");

        // test 1 - a box of 5, as in the workshop example
        Boxes box1 = new Boxes(5);
        System.out.println("Box size: " + box1);
        box1.draw();
        System.out.println();

        // test 2 - a box of 8
        Boxes box2 = new Boxes(8);
        System.out.println("Box size: " + box2);
        box2.draw();
        System.out.println();

        // test 3 - setSize() changes the box
        box2.setSize(10);
        System.out.println("Box size after setSize(10): " + box2);
        box2.draw();
        System.out.println();

        // extension - Unicode box drawing characters
        System.out.println("Unicode extension, box of 5:");
        box1.drawUnicode();
        System.out.println();

        // the range check
        try {
            Boxes tooBig = new Boxes(12);
            System.out.println("Unexpected: " + tooBig);
        } catch (IllegalArgumentException e) {
            System.out.println("Size 12 rejected: " + e.getMessage());
        }
    }
}
