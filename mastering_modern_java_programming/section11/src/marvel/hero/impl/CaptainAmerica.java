package marvel.hero.impl;

import marvel.hero.SuperHero;

public class CaptainAmerica implements SuperHero {

    @Override
    public String usePower() {
        System.out.println(UNIVERSE_NAME);
        return "Captain America use his power";
    }

    @Override
    public String stopVillain(char c) {
        if (c == 'Y') {
            return "Captain America Killed the villain";
        } else {
            return "Captain America stoped the villain";
        }
    }

}
