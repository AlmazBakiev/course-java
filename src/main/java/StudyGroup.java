import java.util.ArrayList;
import java.util.Random;

public class StudyGroup {

    private int groupNumber;
    private int numberOfStudents;

    public StudyGroup(){}

    public StudyGroup(int groupNumber, int numberOfStudents) {
        this.groupNumber = groupNumber;
        this.numberOfStudents = numberOfStudents;
    }

    @Override
    public String toString() {
        return "Group number: " + this.groupNumber + ". " + this.numberOfStudents + " students.";
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public StudyGroup[] getGroups(int i) {
        StudyGroup list[] = new StudyGroup[i];
        Random r = new Random();
        for (int j = 0; j < i; j++) {
            list[j] = new StudyGroup(r.nextInt(1000), r.nextInt(10, 30));
        }
        return list;
    }
}
