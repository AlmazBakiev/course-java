public class HumanGenderException extends Exception {

    private final String gender;

    public HumanGenderException(String message, String gender) {
        super(message);
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
