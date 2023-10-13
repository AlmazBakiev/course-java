import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {

    @Override
    public int compare(Stream o1, Stream o2) {
        int resultOfComparing = 0;
        if (o1.getStreamSize() > o2.getStreamSize()) return 1;
        else if (o1.getStreamSize() < o2.getStreamSize()) return -1;
        else if (o1.getAllStudentsInTheStream() > o2.getAllStudentsInTheStream()) return 1;
        else if (o1.getAllStudentsInTheStream() < o2.getAllStudentsInTheStream()) return -1;
        else return resultOfComparing;
    }
}
