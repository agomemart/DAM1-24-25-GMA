package contornos;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.aggregator.AggregateWith;

import static org.junit.jupiter.api.Assertions.*;

class AgeClassifierTest {

    @Test
    void edadValida() {
        try {
            AgeClassifier ageClassifier = new AgeClassifier();
            String edad = AgeClassifier.classify(-1);
            fail("Debería dar excepción");
            throw new IllegalArgumentException("Idade non válida");
        } catch (Exception e) {
        }
    }

    @Test
    void infantilValido() {
        assertEquals("Infantil", AgeClassifier.classify(0));
        assertEquals("Infantil", AgeClassifier.classify(12));
    }

    @Test
    void adolescenteValido() {
        assertEquals("Adolescente", AgeClassifier.classify(17));
        assertEquals("Adolescente", AgeClassifier.classify(13));
    }

    @Test
    void adutoValido() {
        assertEquals("Adulto", AgeClassifier.classify(18));
        assertEquals("Adulto", AgeClassifier.classify(64));
    }
    @Test
    void adutoNoValido() {
        assertEquals("Senior", AgeClassifier.classify(65));
        assertEquals("Senior", AgeClassifier.classify(120));
    }

}