import java.util.Scanner;

public class Controller {

    private final Scanner scanner = new Scanner(System.in);

    public void start() {
        Calculator calculator = new CalculatorForComplexNumber();

        String str = "";
        while (true) {
            System.out.print("������� �������������� ����� ������� ������������ �����: ");
            double real = scanner.nextDouble();
            System.out.print("������� ������ ����� ������� ������������ �����: ");
            double imaginary = scanner.nextDouble();
            ComplexNumber first = new ComplexNumber(real, imaginary);

            System.out.print("������� ��������: ");
            String action = scanner.next();

            System.out.print("������� �������������� ����� ������� ������������ �����: ");
            real = scanner.nextDouble();
            System.out.print("������� ������ ����� ������� ������������ �����: ");
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
            System.out.print("����� ���������� ������� ����� ������! ����� ����� ������� '=': ");
            str = scanner.next();
            if (str.equals("=")) break;
        }
    }
}
