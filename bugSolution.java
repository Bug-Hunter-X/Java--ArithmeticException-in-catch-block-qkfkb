public class MyClass {
    public static void main(String[] args) {
        int i = 10;
        try {
            System.out.println(i / 0); // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
            //Do not attempt to perform the same operation that caused exception
        }
    }
}