/*
В классе Main происходит создание экземпляра класса Calculator и выполнение нескольких арифметических операций над
числами.
 */
public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        /*
        переменная b равна 0, так как 1-1=0. Произошло деление на 0. В качестве решения проблемы можно изменить
            переменную devide класса Calculator с помощью try/catch.
         */
        int c = calc.devide.apply(a, b);
        calc.println.accept(c);


    }
}