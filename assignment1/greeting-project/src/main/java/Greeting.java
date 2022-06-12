public class Greeting {
    private final String name;

    public Greeting(String name) {
        this.name = name;
    }

    public String greet() {
        if (name == null) {
            return "Hello, my friend";
        }
        return "Hello, " + this.name;
    }
}