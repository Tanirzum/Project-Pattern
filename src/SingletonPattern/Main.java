package SingletonPattern;

public class Main {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogger("First Log...\n");
        ProgramLogger.getProgramLogger().addLogger("Secong Log...\n");
        ProgramLogger.getProgramLogger().addLogger("Third Log...\n");

        ProgramLogger.getProgramLogger().snowLogFile();
    }
}
