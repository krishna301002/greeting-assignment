import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingTest {

    @Test
    void shouldReturnGreetingWithName() {
        String[] names = {"Bob"};
        Greeting greeting = new Greeting(names);

        String resultGreeting = greeting.greet();

        assertEquals("Hello, Bob.", resultGreeting);
    }

    @Test
    void shouldHandleNullName() {
        Greeting greeting = new Greeting(null);

        String greet = greeting.greet();

        assertEquals("Hello, my friend.", greet);
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

        assertEquals("Hello, Jill and Jane.", greet);
    }

    @Test
    void shouldGreetWhenArbitraryNumberOfNamesIsGiven() {
        String[] names = {"Amy", "Brian", "Charlotte"};
        Greeting greeting = new Greeting(names);

        String greet = greeting.greet();

        assertEquals("Hello, Amy, Brian, and Charlotte.", greet);
    }

    @Test
    void shouldGreetNormalAndShoutedNamesWhenBothTypeOfNamesAreMixed() {
        String[] names = {"Amy", "BRIAN", "Charlotte"};
        Greeting greeting = new Greeting(names);

        String greet = greeting.greet();

        assertEquals("Hello, Amy and Charlotte. AND HELLO BRIAN!", greet);
    }

    @Test
    void shouldGreetWhenTheNamesOrOneOfTheNamesAreGivenAsSingleStringSeparatedByComma() {
        String[] names = {"Bob", "Charlie, Dianne"};
        Greeting greeting = new Greeting(names);

        String greet = greeting.greet();

        assertEquals("Hello, Bob, Charlie, and Dianne.", greet);
    }

    @Test
    void shouldGreetTheNamesTogetherWhenTheNamesAreGivenWithIntentionalCommas() {
        String[] names = {"Bob", "\"Charlie, Dianne\""};
        Greeting greeting = new Greeting(names);

        String greet = greeting.greet();

        assertEquals("Hello, Bob and Charlie, Dianne.", greet);
    }
}