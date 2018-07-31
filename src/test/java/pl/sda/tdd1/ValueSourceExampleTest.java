package pl.sda.tdd1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@DisplayName("Pass the method parameters provided by the @ValueSource annotation")
public class ValueSourceExampleTest {

    @DisplayName("Should pass a non-null message to our test method")
    @ParameterizedTest
    @ValueSource(strings = {"Hello", "World" , "Git maszyna" , ""})
    void shouldPassNonNullMessageAsMethodParameter(String message) {
        assertNotNull(message);
    }

}
