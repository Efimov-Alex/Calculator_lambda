public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        try{
            int c = calc.devide.apply(a, b);
            /* переменная b равна 0, так как 1-1=0. Произошло деление на 0. В качестве решения проблемы можно изменить
            переменную devide класса Calculator так,чтобы была проверка на равенство 0 делимого, если делимое не равно
            0, то возвращаем значение, иначе выбрасываем исключение.
             */

            calc.println.accept(c);
        }
        catch (ArithmeticException e){
            System.out.println("Произошло деление на 0.");
        }
    }
}