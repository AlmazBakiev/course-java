public class HumanPhoneNumberException extends Exception {

    private final int phoneNumber;

    public HumanPhoneNumberException(String message, int phoneNumber) {
        super(message);
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
}
