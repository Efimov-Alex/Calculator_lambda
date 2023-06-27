import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test_Calculator {
    @org.junit.jupiter.api.Test
    public void testConcat_validArgument_success() {
        // given:
        Calculator calc = Calculator.instance.get();
        int number1 = 7;
        int number2 = 3;
        int number3 = 15;
        int number4 = 10;

        // when:
        int a = calc.plus.apply(number1, number2);
        int b = calc.minus.apply(number3, number4);
        int c = calc.devide.apply(a, b);

        // then:
        assertThat(c, equalTo(10 / 5));
    }

    @org.junit.jupiter.api.Test
    public void testConcat_nullDevide_throwsException() {
        // given:
        Calculator calc = Calculator.instance.get();
        int number1 = 7;
        int number2 = 3;
        int number3 = 15;
        int number4 = 15;
        boolean thrown = false;

        // when:
        try {
            int a = calc.plus.apply(number1, number2);
            int b = calc.minus.apply(number3, number4);
            int c = calc.devide.apply(a, b);
        } catch (ArithmeticException e) {
            thrown = true;
        }

        // then:
        assertTrue(thrown);
    }

    @org.junit.jupiter.api.Test
    public void testConcat_multiply_success() {
        // given:
        Calculator calc = Calculator.instance.get();
        int number1 = 7;
        int number2 = 3;
        int number3 = 20;
        int number4 = 10;

        // when:
        int a = calc.plus.apply(number1, number2);
        int b = calc.minus.apply(number3, number4);
        int c = calc.multiply.apply(a, b);
        int d = calc.pow.apply(a);

        // then:
        assertThat(c, equalTo(d));
    }

    @org.junit.jupiter.api.Test
    public void testConcat_mulyiply_greater_success() {
        // given:
        Calculator calc = Calculator.instance.get();
        int number1 = 2;
        int number2 = 9;
        int number3 = 10;
        int number4 = 8;

        // when:
        int a = calc.plus.apply(number1, number2);
        int b = calc.minus.apply(number3, number4);
        int c = calc.multiply.apply(a, b);

        // then:
        assertThat(c, is(greaterThan(20)));
    }


}
