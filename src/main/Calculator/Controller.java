import java.util.Scanner;

public class Controller {

    private final Scanner scanner = new Scanner(System.in);

    public void start() {
        Calculator calculator = new CalculatorForComplexNumber();

        String str = "";
        while (true) {
            System.out.print("Введите действительную часть первого комплексного числа: ");
            double real = scanner.nextDouble();
            System.out.print("Введите мнимую часть первого комплексного числа: ");
            double imaginary = scanner.nextDouble();
            ComplexNumber first = new ComplexNumber(real, imaginary);

            System.out.print("Введите действие: ");
            String action = scanner.next();

            System.out.print("Введите действительную часть второго комплексного числа: ");
            real = scanner.nextDouble();
            System.out.print("Введите мнимую часть второго комплексного числа: ");
            imaginary = scanner.nextDouble();
            ComplexNumber second = new ComplexNumber(real, imaginary);

            switch (action) {
                case "+":
                    System.out.println(calculator.sum(first, second));
                    break;
                case "-":
                    System.out.println(calculator.subtract(first, second));
                    break;
                case "*":
                    System.out.println(calculator.multiply(first, second));
                    break;
                case "/":
                    System.out.println(calculator.divide(first, second));
                    break;
            }
            System.out.print("Чтобы продолжить введите любой символ! Чтобы выйти введите '=': ");
            str = scanner.next();
            if (str.equals("=")) break;
        }
    }
}
