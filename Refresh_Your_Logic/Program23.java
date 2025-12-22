class Program23 {

    static void checkNumber(int num) {
        try {
            if (num < 0) {
                throw new ArithmeticException("Negative number not allowed");
            }
            System.out.println("Number is valid: " + num);
        } catch (ArithmeticException e) {
            System.out.println("Caught exception in checkNumber(): " + e.getMessage());
            // Re-throwing the exception
            throw e;
        } finally {
            System.out.println("Finally block in checkNumber() executed");
        }
    }

    public static void main(String[] args) {
        try {
            checkNumber(-5);
        } catch (ArithmeticException e) {
            System.out.println("Caught exception in main(): " + e.getMessage());
        } finally {
            System.out.println("Finally block in main() executed");
        }
    }
}
