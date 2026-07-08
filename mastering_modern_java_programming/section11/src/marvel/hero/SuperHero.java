package marvel.hero;

public interface SuperHero extends Person {
    String UNIVERSE_NAME = "MARVEL";

    public String usePower();

    /**
     * @param c Y kill the villain : N stop the villain
     * @return - returns Status
     */
    public String stopVillain(char c);
}
