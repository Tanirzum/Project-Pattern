package ProxyPattern;

public class RealProject implements Project {
    private String url;

    public RealProject(String url) {
        this.url = url;
        load();
    }

    public void load() {
        System.out.println("Loading project from url," + url);
    }

    @Override
    public void run() {
        System.out.println("Runing project from url," + url);
    }
}
