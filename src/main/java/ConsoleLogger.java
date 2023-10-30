import java.io.FileWriter;
import java.io.IOException;

public class ConsoleLogger {

    FileWriter writerLog;

    public ConsoleLogger(String title) {
        try {
            writerLog = new FileWriter(title + ".txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void write(String message) {
        try {
            writerLog.write(message + "\n");
            writerLog.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
