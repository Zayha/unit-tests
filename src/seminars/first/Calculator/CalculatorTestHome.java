package seminars.first.Calculator;

import org.assertj.core.api.Assertions;

//import static org.assertj.core.api.Assertions.*;

public class CalculatorTestHome {
    public static void main(String[] args) {
        testCalculateDiscount_ValidArgs1();
        testCalculateDiscount_ValidArgs2();
        testCalculateDiscount_InvalidArgs1();
        testCalculateDiscount_InvalidArgs2();
        testCalculateDiscount_InvalidArgs3();
        testCalculateDiscount_InvalidArgs4();
        testCalculateDiscount_BoundaryArgs1();
        testCalculateDiscount_BoundaryArgs2();
        testCalculateDiscount_BoundaryArgs3();
    }

    private static void testCalculateDiscount_ValidArgs1() {
        double result = Calculator.calculateDiscount(100, 50);
        Assertions.assertThat(result).isEqualTo(50.0);

        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println("Test: " + methodName + " OK!");
    }

    private static void testCalculateDiscount_ValidArgs2() {
        double result = Calculator.calculateDiscount(50, 33);
        Assertions.assertThat(result).isEqualTo(33.5);

        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println("Test: " + methodName + " OK!");
    }

    private static void testCalculateDiscount_BoundaryArgs1() {
        double result = Calculator.calculateDiscount(0, 33);
        Assertions.assertThat(result).isEqualTo(0);

        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println("Test: " + methodName + " OK!");
    }

    private static void testCalculateDiscount_BoundaryArgs2() {
        double result = Calculator.calculateDiscount(50, 0);
        Assertions.assertThat(result).isEqualTo(50);

        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println("Test: " + methodName + " OK!");
    }

    private static void testCalculateDiscount_BoundaryArgs3() {
        double result = Calculator.calculateDiscount(0, 0);
        Assertions.assertThat(result).isEqualTo(0);

        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println("Test: " + methodName + " OK!");
    }

    private static void testCalculateDiscount_InvalidArgs1() {
        Assertions.assertThatThrownBy(() -> Calculator.calculateDiscount(-100, 50)).isInstanceOf(ArithmeticException.class);

        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println("Test: " + methodName + " OK!");
    }

    private static void testCalculateDiscount_InvalidArgs2() {
        Assertions.assertThatThrownBy(() -> Calculator.calculateDiscount(100, -50)).isInstanceOf(ArithmeticException.class);

        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println("Test: " + methodName + " OK!");
    }

    private static void testCalculateDiscount_InvalidArgs3() {
        Assertions.assertThatThrownBy(() -> Calculator.calculateDiscount(-100, -50)).isInstanceOf(ArithmeticException.class);

        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println("Test: " + methodName + " OK!");
    }

    private static void testCalculateDiscount_InvalidArgs4() {
        Assertions.assertThatThrownBy(() -> Calculator.calculateDiscount(100, 150)).isInstanceOf(ArithmeticException.class);

        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println("Test: " + methodName + " OK!");
    }

}
