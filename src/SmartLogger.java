import java.time.LocalDateTime;

public class SmartLogger implements Logger {
    private int msgID;

    @Override
    public void log(String msg) {
        System.out.println((msg.matches("(?i).*" + "error" + ".*") ? "ERROR#" : "INFO#")
                + msgID++ + " [" + LocalDateTime.now() + "] " + msg);
    }
}
