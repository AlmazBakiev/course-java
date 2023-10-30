import java.util.Scanner;

public class Controller {

    private Scanner sc = new Scanner(System.in);

    public void start() {
        System.out.print("Введите пол: ");
        String gender = sc.next();
        System.out.print("Введите фамилию: ");
        String secondName = sc.next();
        System.out.print("Введите имя: ");
        String firstName = sc.next();
        System.out.print("Введите отчество: ");
        String lastName = sc.next();
        System.out.print("Введите номер телефона +7");
        int phoneNumber = sc.nextInt();
        System.out.print("Введите дату рождения: ");
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
                    throw new HumanGenderException("Неверно введен пол!", gender);
            }
        } catch (HumanFIOException e) {
            System.out.printf("Введено '%d', '%d', '%d'!", e.getSecondName(), e.getFirstName(), e.getLastName());
        } catch (HumanBirthDayException e) {
            System.out.println("Должный формат 'дд.мм.гггг', введено " + e.getBirthDay());
        } catch (HumanPhoneNumberException e) {
            System.out.println(e.getMessage());
        } catch (HumanGenderException e) {
            System.out.println("Ожидаемый формат 'f' или 'm'! Введено '" + e.getGender() + "'!");
        }
    }
}
