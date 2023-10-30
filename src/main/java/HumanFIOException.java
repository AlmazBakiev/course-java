public class HumanFIOException extends Exception {

    private final String firstName;
    private final String secondName;
    private final String lastName;

    public HumanFIOException(String message, String firstName, String secondName, String lastName) {
        super(message);
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }
}
