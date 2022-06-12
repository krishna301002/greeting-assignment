import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingTest {
    @Test
    void shouldReturnGreetingWithName() {
        Greeting greeting = new Greeting("Bob");
        String resultGreeting = greeting.greet();

        assertEquals("Hello, Bob", resultGreeting);
    }

    @Test
    void shouldHandleNullName() {
        Greeting greeting = new Greeting(null);
        String greet = greeting.greet();

        assertEquals("Hello, my friend", greet);
    }
}
