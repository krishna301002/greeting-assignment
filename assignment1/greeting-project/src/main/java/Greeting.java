import static java.lang.Character.isUpperCase;

public class Greeting {
    private final String name;

    public Greeting(String name) {
        this.name = name;
    }

    public String greet() {
        if (name == null) {
            return "Hello, my friend";
        }
        if (name.equals(name.toUpperCase())) {
            return "HELLO " + this.name + "!";
        }
        return "Hello, " + this.name;
    }
}