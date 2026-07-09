package marvel.hero.app;

import marvel.hero.SuperHero;
import marvel.hero.impl.CaptainAmerica;
import marvel.hero.impl.Developer;
import marvel.hero.impl.Ironman;
import marvel.hero.impl.Spiderman;

public class MarvelHeroDemo {
    public static void main(String[] args) {
        SuperHero ironman = new Ironman();
        SuperHero spiderman = new Spiderman();
        SuperHero captainAmerice = new CaptainAmerica();

        invokeSuperHero(ironman);
        invokeSuperHero(spiderman);
        invokeSuperHero(captainAmerice);

        System.out.println(SuperHero.commonCharacteristic());

        Developer developer = new Developer();
        developer.walk();
    }

    public static void invokeSuperHero(SuperHero superHero) {
        System.out.println(superHero.usePower());
        System.out.println(superHero.stopVillain('Y'));
    }
}
