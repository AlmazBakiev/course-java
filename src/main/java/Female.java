public class Female extends Human {

    private Female(String secondName, String firstName, String lastName, String birthDay, int phoneNumber, char gender) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public static Female createFemale(String secondName, String firstName, String lastName, String birthDay, int phoneNumber, String gender)
            throws HumanFIOException, HumanBirthDayException, HumanPhoneNumberException, HumanGenderException {
        if ((firstName == null || secondName == null || lastName == null)
                && (firstName.length() < 3 || secondName.length() < 3 || lastName.length() < 3)) {
            throw new HumanFIOException("Не корректно введены данные!", firstName, secondName, lastName);
        }
        if (birthDay == null || birthDay.length() != 10) {
            throw new HumanBirthDayException("Некорректно введена дата рождения!", birthDay);
        }
        if (phoneNumber < 0)
            throw new HumanPhoneNumberException("Некорректно введен номер телефона!", phoneNumber);
        char[] array = gender.toCharArray();
        if (array.length != 1 && array[0] != 'f' && array[0] != 'm') {
            throw new HumanGenderException("Некорректно введен пол!", gender);
        }
        return new Female(firstName, secondName, lastName, birthDay, phoneNumber, array[0]);
    }
}
