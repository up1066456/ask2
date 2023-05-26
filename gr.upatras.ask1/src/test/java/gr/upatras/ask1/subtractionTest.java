package gr.upatras.ask1;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class subtractionTest {

@Test
void testsubtraction() {
subtraction tester = new subtraction();
assertEquals("positive", tester.subtract(5, 3), "10 - 11 must be positive");
}
}
