package controller;

import utils.Configs;

import java.util.Locale;

public class PlaceRushOrder {
    public boolean isRushOrderAddress(String address) {
        if (address.toLowerCase().contains("ha noi")) {
            return true;
        }

        return false;
    }
}
