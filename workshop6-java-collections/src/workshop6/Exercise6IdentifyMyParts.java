package workshop6;

/**
 * Workshop 6 - Exercise 6 (Easy)
 *
 * Runs the code given in the question and prints the output.
 *
 * Because x is static there is only ONE x for the whole class, so a.x and
 * b.x are the same variable. y is an instance variable, so a.y and b.y are
 * two separate variables.
 */
public class Exercise6IdentifyMyParts {

    public static void main(String[] args) {

        IdentifyMyParts a = new IdentifyMyParts();
        IdentifyMyParts b = new IdentifyMyParts();

        a.y = 5;
        b.y = 6;
        a.x = 1;
        b.x = 2;

        System.out.println("a.y = " + a.y);
        System.out.println("b.y = " + b.y);
        System.out.println("a.x = " + a.x);
        System.out.println("b.x = " + b.x);
        System.out.println("IdentifyMyParts.x = " + IdentifyMyParts.x);
    }
}
