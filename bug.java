public class MyClass {
    public static void main(String[] args) {
        int i = 10;
        try {
            System.out.println(i / 0); // ArithmeticException
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
            System.out.println(i / 0); // Another ArithmeticException
        }
    }
}