import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudyGroup> {

    private List<StudyGroup> groupList;
    private int streamNumber;


    public Stream(int streamNumber, int numberOfGroups) {
        this.streamNumber = streamNumber;
        this.groupList = List.of(new StudyGroup().getGroups(numberOfGroups));
    }

    public int getStreamSize() {
        return groupList.size();
    }

    public int getAllStudentsInTheStream() {
        int result = 0;
        for (StudyGroup group : groupList) {
            result += group.getNumberOfStudents();
        }
        return result;
    }

    public int getStreamNumber() {
        return streamNumber;
    }

    @Override
    public String toString() {
        return "Stream number: " + getStreamNumber()
                + ". Number of groups: " + getStreamSize()
                + ". All students in the stream: " + getAllStudentsInTheStream()
                + ".";
    }

    @Override
    public Iterator<StudyGroup> iterator() {
        return new Iterator<StudyGroup>() {

            private int counter = 0;

            @Override
            public boolean hasNext() {
                return counter < groupList.size();
            }

            @Override
            public StudyGroup next() {
                if (!hasNext()) {
                    return null;
                }
                return groupList.get(counter++);
            }
        };
    }
}
