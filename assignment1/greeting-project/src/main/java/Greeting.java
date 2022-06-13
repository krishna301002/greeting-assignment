import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Greeting {
    private final String[] names;
    private final StringBuilder greeting;

    public Greeting(String[] names) {
        this.names = names;
        greeting = new StringBuilder();
    }

    public String greet() {
        if (names == null) greeting.append("Hello, my friend.");
        else if (names.length == 1) {
            if (names[0].equals(names[0].toUpperCase())) greeting.append("HELLO ").append(names[0]).append("!");
            else greeting.append("Hello, ").append(names[0]).append(".");
        } else if (names.length == 2) {
            greeting.append("Hello, ").append(names[0]).append(" and ").append(names[1]).append(".");
        } else {
            greeting.append("Hello");
            List<String> loudNames = new ArrayList<>();
            List<String> normalNames = new ArrayList<>();
            for (int i = 0; i < Objects.requireNonNull(names).length; i++) {
                if (names[i].equals(names[i].toUpperCase())) loudNames.add(names[i]);
                else normalNames.add(names[i]);
            }
            if (normalNames.size() == 2) {
                greeting.append(", ").append(normalNames.get(0)).append(" and ").append(normalNames.get(1)).append(".");
            } else {
                for (int i = 0; i < normalNames.size() - 1; i++) {
                    greeting.append(", ").append(normalNames.get(i));
                }
                greeting.append(", and ").append(normalNames.get(normalNames.size() - 1)).append(".");
            }
            if (!loudNames.isEmpty()) {
                greeting.append(" AND HELLO");
                for (String loudName : loudNames) {
                    greeting.append(" ").append(loudName);
                }
                greeting.append("!");
            }
        }
        return greeting.toString();
    }
}