package SingletonPattern;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logFile = "This is log file.\n\n";

    public static synchronized ProgramLogger getProgramLogger() {
        if (programLogger == null) {
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }

    private ProgramLogger() {

    }

    public void addLogger(String logInfo) {
        logFile += logInfo;
    }

    public void snowLogFile() {
        System.out.println(logFile);
    }
}