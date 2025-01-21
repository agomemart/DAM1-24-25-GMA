package ud4.prueba;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PruebaJUnit {
        @Test
        public void testSum() {
            int result = 2 + 3;
            assertEquals(5, result);
        }

}
