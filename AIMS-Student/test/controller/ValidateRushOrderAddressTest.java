package controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidateRushOrderAddressTest {
    private PlaceRushOrder placeRushOrder;
    @BeforeEach
    void setUp() throws Exception {
        placeRushOrder = new PlaceRushOrder();
    }

    @ParameterizedTest
    @CsvSource({
            "abc, false",
            "Bach Khoa, false",
            "Bach khoa Ha noi, true",
    })
    public void test(String address, boolean expected) {
        // when
        boolean isValid = placeRushOrder.isRushOrderAddress(address);

        // then
        assertEquals(expected, isValid);
    }
}
