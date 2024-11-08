import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ExampleTest {
    @Test
    void isEvenShouldReturnTrueWhenInputIs2(){
        assertTrue(Example.isEven(2));
    }

    @Test
    void isEvenShouldReturnFalseWhenInputIs3(){
        assertFalse(Example.isEven(3));
    }

}
