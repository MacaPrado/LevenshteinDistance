import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LevenshteinTest {

    @Test
    void distanciaCorrecta() {
        Assertions.assertEquals(1, LevenshteinDistance.distance("pepe", "pope"));
        Assertions.assertEquals(2, LevenshteinDistance.distance("smart", "art"));
        Assertions.assertEquals(0, LevenshteinDistance.distance("machine", "machine"));
        Assertions.assertEquals(0.6, LevenshteinDistance.normalizedSimilarity("smart", "art"));
    }

    @Test
    void simetria() {
        Assertions.assertTrue(LevenshteinDistance.distance("estructura", "caricatura") == LevenshteinDistance.distance("caricatura", "estructura"));
        Assertions.assertTrue(LevenshteinDistance.distance("java", "ruby") == LevenshteinDistance.distance("ruby", "java"));
    }

    @Test
    void desigualdad() {
        String str1 = "algoritmos", str2 = "arquitectura", str3 = "itba";
        Assertions.assertTrue((LevenshteinDistance.distance(str1, str2) + LevenshteinDistance.distance(str2, str3)) >= LevenshteinDistance.distance(str1, str3));
    }

    @Test
    void distanceOk() { }

    @Test
    void normalizedSimilarityOk() {
        Assertions.assertEquals(0.75, LevenshteinDistance.normalizedSimilarity("big data", "bigdaa"));
    }

}
