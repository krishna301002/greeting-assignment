import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingTest {

    @Test
    void shouldReturnGreetingWithName() {
        String[] names = {"Bob"};
        Greeting greeting = new Greeting(names);
        String resultGreeting = greeting.greet();

        assertEquals("Hello, Bob", resultGreeting);
    }

    @Test
    void shouldHandleNullName() {
        Greeting greeting = new Greeting(null);
        String greet = greeting.greet();

        assertEquals("Hello, my friend", greet);
    }

    @Test
    void shouldShoutWhenNameIsUppercase() {
        String[] names = {"JERRY"};
        Greeting greeting = new Greeting(names);
        String greet = greeting.greet();

        assertEquals("HELLO JERRY!", greet);
    }

    @Test
    void shouldGreetMoreThanOneName() {
        String[] names = {"Jill", "Jane"};
        Greeting greeting = new Greeting(names);
        String greet = greeting.greet();

        assertEquals("Hello, Jill and Jane", greet);
    }

    @Test
    void shouldGreetWhenArbitraryNumberOfNamesIsGiven() {
        String[] names = {"Amy", "Brian", "Charlotte"};
        Greeting greeting = new Greeting(names);
        String greet = greeting.greet();

        assertEquals("Hello, Amy, Brian, and Charlotte", greet);
    }
}
