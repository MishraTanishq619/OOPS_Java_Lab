import java.util.Scanner;

public class ExceptionHandling2 {

    public static void main(String[] args) throws Exception {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Type Marks :");

        int m1;
        try {
            m1 = (s1.nextInt());
            if (m1 > 100) {
                OverException();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Got marks.");
        }
    }

    static void OverException() throws Exception {
        throw new Exception("Marks Greater than 100.");
    }

}
