import org.example.ArrayUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {

    @Test
    public void testEmptyArray() {
        int[] input= {};
        int expected = 0;
        int actual = ArrayUtils.find(input);
        assertEquals(expected, actual);
    }

    @Test
    public void singleOddNumber() {
        int[] input= {1};
        int expected = 1;
        int actual = ArrayUtils.find(input);
        assertEquals(expected, actual);
    }

    @Test
    public void oneOddAndOneEvenNumber() {
        int[] input= {1, 2};
        int expected = -1;
        int actual = ArrayUtils.find(input);
        assertEquals(expected, actual);
    }

    @Test
    public void threeOddNumbers() {
        int[] input= {1, 2, 3};
        int expected = 2;
        int actual = ArrayUtils.find(input);
        assertEquals(expected, actual);
    }
}
