import org.example.FirstNonRepeatingChar;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FirstNonRepeatingCharTest {

    @Test
    public void firstNonRepeatingChar() {
        System.out.println("First Non-Repeating Character");
        String input = "swiss";
        char result = FirstNonRepeatingChar.firstNonRepeatingChar(input);
        assertEquals('w', result);
    }

    @Test
    public void testFirstNonRepeatingChar_emptyString() {
        String input = "";
        char expected = '\0';
        int actual = new FirstNonRepeatingChar().firstNonRepeatingChar(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testFirstNonRepeatingChar_allRepeating() {
        String input = "aabbcc";
        char expected = '\0';
        int actual = new FirstNonRepeatingChar().firstNonRepeatingChar(input);
        assertEquals(expected, actual);
    }
}