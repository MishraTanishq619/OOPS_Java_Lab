/**
 * ExceptionHandling
 */
public class ExceptionHandling {

    public static void main(String[] args) throws Exception, Error {
        Number a = 10;
        Number b = 12;

        // if (a.intValue() > b.intValue()) {
        // System.out.println("True");
        // } else {
        // myException();
        // }

        // try (a.intValue() > b.intValue()) {
        // System.out.println("True");
        // } else {
        // myException();
        // }

        try {
            myException();
            System.out.println(a.intValue() / 0);

        } catch (Exception e) {
            // System.out.println("hjabschjbshcjsa");
            System.out.println(e.getMessage());

        } finally {
            System.out.println("finally");
        }

    }

    static void myException() throws Exception {
        throw new Exception("Wrongjksvnjdnv.");

    }
}