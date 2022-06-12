public class Greeting {
    private final String[] names;
    private final StringBuilder greeting;

    public Greeting(String[] names) {
        this.names = names;
        greeting = new StringBuilder();
    }

    public String greet() {
        if (names == null) greeting.append("Hello, my friend");
        if (names != null && names.length == 1) {
            if (names[0].equals(names[0].toUpperCase())) greeting.append("HELLO ").append(names[0]).append("!");
            else greeting.append("Hello, ").append(names[0]);
        }
        if (names != null && names.length == 2) {
            greeting.append("Hello, ").append(names[0]).append(" and ").append(names[1]);
        }
        return greeting.toString();
    }
}