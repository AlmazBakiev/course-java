import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Stream stream1 = new Stream(1, 8);
        Stream stream2 = new Stream(2, 2);
        Stream stream3 = new Stream(3, 5);
        Stream stream4 = new Stream(4, 3);
        Stream stream5 = new Stream(5, 3);

        List<Stream> streams = new ArrayList<>();

        streams.add(stream1);
        streams.add(stream2);
        streams.add(stream3);
        streams.add(stream4);
        streams.add(stream5);

        for (StudyGroup group : stream1) {
            System.out.println(group);
        }

        System.out.println("-----------------------------------------------------------------------");

        Collections.sort(streams, new StreamComparator());

        for (Stream stream : streams) {
            System.out.println(stream);
        }
    }
}
