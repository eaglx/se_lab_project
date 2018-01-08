package pl.put.poznan.transformer.logic;

/**
 * Localization interace, describes basic functions
 */
public interface Localization {

    /**
     * Get lighting of localization
     * @return lighting of localization
     */
    float getArea();
    /**
     * Get cubature of localization
     * @return cubature of localization
     */
    float getCube();
    /**
     * Get heating of localization
     * @return heating of localization
     */
    float getHeating();
    /**
     * Get lighting of localization
     * @return lighting of localization
     */
    float getLight();

}
