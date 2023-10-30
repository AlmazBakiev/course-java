public class HumanBirthDayException extends Exception {

    private final String birthDay;

    public HumanBirthDayException(String message, String birthDay) {
        super(message);
        this.birthDay = birthDay;
    }

    public String getBirthDay() {
        return birthDay;
    }
}
