package marvel.hero;

public interface SuperHero extends Person {
    String UNIVERSE_NAME = "MARVEL";

    public String usePower();

    /**
     * @param c Y kill the villain : N stop the villain
     * @return - returns Status
     */
    public String stopVillain(char c);

    // the default syntax make the class of this interface not allowed
    // to implement this immediatlly
    public default String trackLiveLocation() {
        String liveLocation = "USA";
        System.out.println("I'm in " + liveLocation);
        return liveLocation;
    }

}
