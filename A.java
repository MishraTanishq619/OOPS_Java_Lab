public class A {
    // 1
    // public static void main(String[] args) {
    //     int a = Integer.parseInt(args[0]);
    //     int b = Integer.parseInt(args[1]);
    //     int sum = a + b;
    //     System.out.println("\nSum is : "+sum);
    // }

    public static void main(String[] args) {
        String name = args[0];
        String branch = args[1];

        System.out.println("Name is : "+name+"\nBranch is : "+branch);
    }
}
