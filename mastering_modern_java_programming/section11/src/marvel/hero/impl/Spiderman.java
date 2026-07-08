package marvel.hero.impl;

import marvel.hero.SuperHero;

public class Spiderman implements SuperHero {

    @Override
    public String usePower() {
        return "Spiderman use his power";

    }

    @Override
    public String stopVillain(char c) {
        if (c == 'Y') {
            return "Spiderman Killed the villain";
        } else {
            return "Spiderman stoped the villain";
        }
    }

}
