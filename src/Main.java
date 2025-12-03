
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SimpleLogger simpleLogger = new SimpleLogger();
        SmartLogger smartLogger = new SmartLogger();

        while (true) {
            System.out.println("Введите сообщение или `end` для выхода:");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                    break;
                } else {
                simpleLogger.log(input);
                smartLogger.log(input);
            }
        }
    }
}