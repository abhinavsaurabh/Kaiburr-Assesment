

public class Server {

    private final String name;
    private final int id;
    private final String langauage;
    private final String framework;

    public Greeting(String name, int id,String langauage,String framework) {
        this.name = name;
        this.id = id;
        this.language = language;
        this.framework = framework;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getlanguage() {
        return language;
    }

    public String getframework() {
        return framework;
    }
}
