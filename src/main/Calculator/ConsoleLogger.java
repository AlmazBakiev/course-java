import java.io.FileWriter;
import java.io.IOException;

public class ConsoleLogger {

    private FileWriter writeLog;

    public ConsoleLogger() {
        try {
            writeLog = new FileWriter("calc_log.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void log(String message) {
        try {
            writeLog.write(message + "\n");
            writeLog.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
