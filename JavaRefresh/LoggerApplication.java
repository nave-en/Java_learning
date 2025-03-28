public class LoggerApplication {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("First Log message!");
        Logger logger2 = Logger.getInstance();
        logger2.log("Second Log message!");
    }
}
