import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DummyTest {
    @Test
    void shouldGiveNumber() {
        assertEquals(5, Dummy.number());
    }

}