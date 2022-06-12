public class Greeting {
    private String name;

    public Greeting(String name) {
        this.name = name;
    }

    public String greet() {

        return "Hello, "+this.name;
    }
}
