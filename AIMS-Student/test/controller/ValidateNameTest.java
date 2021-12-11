package controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidateNameTest {
    private PlaceOrderController placeOrderController;
    @BeforeEach
    void setUp() throws Exception {
        placeOrderController = new PlaceOrderController();
    }

    @ParameterizedTest
    @CsvSource({
            ", false",
            "a1, false",
            "aa@, false",
            "Ly Trung Kien, true",
            "abc, true",
    })
    public void test(String name, boolean expected) {
        // when
        boolean isValid = placeOrderController.validateName(name);

        // then
        assertEquals(expected, isValid);
    }
}
