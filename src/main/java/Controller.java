import java.util.Scanner;

public class Controller {

    private Scanner sc = new Scanner(System.in);

    public void start() {
        System.out.print("������� ���: ");
        String gender = sc.next();
        System.out.print("������� �������: ");
        String secondName = sc.next();
        System.out.print("������� ���: ");
        String firstName = sc.next();
        System.out.print("������� ��������: ");
        String lastName = sc.next();
        System.out.print("������� ����� �������� +7");
        int phoneNumber = sc.nextInt();
        System.out.print("������� ���� ��������: ");
        String birthDay = sc.next();
        try {
            switch (gender) {
                case ("m"):
                    Human man = Male.createMale(secondName, firstName, lastName, birthDay, phoneNumber, gender);
                    ConsoleLogger manLogger = new ConsoleLogger(man.secondName);
                    manLogger.write("<" + man.secondName + "><" + man.firstName + "><" + man.lastName
                            + "><" + man.birthDay + "><" + man.phoneNumber + "><" + man.gender + ">");
                    break;
                case ("f"):
                    Human woman = Female.createFemale(secondName, firstName, lastName, birthDay, phoneNumber, gender);
                    ConsoleLogger womanLogger = new ConsoleLogger(woman.secondName);
                    womanLogger.write("<" + woman.secondName + "><" + woman.firstName + "><" + woman.lastName
                            + "><" + woman.birthDay + "><" + woman.phoneNumber + "><" + woman.gender + ">");
                    break;
                default:
                    throw new HumanGenderException("������� ������ ���!", gender);
            }
        } catch (HumanFIOException e) {
            System.out.printf("������� '%d', '%d', '%d'!", e.getSecondName(), e.getFirstName(), e.getLastName());
        } catch (HumanBirthDayException e) {
            System.out.println("������� ������ '��.��.����', ������� " + e.getBirthDay());
        } catch (HumanPhoneNumberException e) {
            System.out.println(e.getMessage());
        } catch (HumanGenderException e) {
            System.out.println("��������� ������ 'f' ��� 'm'! ������� '" + e.getGender() + "'!");
        }
    }
}
