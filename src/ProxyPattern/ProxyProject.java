package ProxyPattern;

public class ProxyProject implements Project {
    private String url;
    private RealProject realPRoject;

    public ProxyProject(String url) {
        this.url = url;

    }

    @Override
    public void run() {
        if (realPRoject == null) {
            realPRoject = new RealProject(url);
        }
        realPRoject.run();
    }
}
