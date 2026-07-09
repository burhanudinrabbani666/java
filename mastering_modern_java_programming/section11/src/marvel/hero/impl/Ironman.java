package marvel.hero.impl;

import marvel.hero.SuperHero;

public class Ironman implements SuperHero {

    @Override
    public String usePower() {
        System.out.println(UNIVERSE_NAME);
        return "Ironman using his power";
    }

    @Override
    public String stopVillain(char c) {

        if (c == 'Y') {
            return "Ironman Killed the villain";
        } else {
            return "Ironman stoped the villain";
        }
    }

    @Override
    public String trackLiveLocation() {
        String liveLocation = "Indonesia";
        System.out.printf("I'm ironman, now in %s\n", liveLocation);
        return liveLocation;
    }

}
