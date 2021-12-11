package controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidateAddressTest {
    private PlaceOrderController placeOrderController;
    @BeforeEach
    void setUp() throws Exception {
        placeOrderController = new PlaceOrderController();
    }

    @ParameterizedTest
    @CsvSource({
            ", false",
            "Bach Khoa, true",
            "abc@123, false",
            "ab12, true",
    })
    public void test(String address, boolean expected) {
        // when
        boolean isValid = placeOrderController.validateAddress(address);

        // then
        assertEquals(expected, isValid);
    }
}
