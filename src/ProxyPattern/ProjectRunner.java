package ProxyPattern;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://github.com/Tanirzum");
        project.run();
    }
}
