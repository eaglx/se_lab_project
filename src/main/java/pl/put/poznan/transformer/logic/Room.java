package pl.put.poznan.transformer.logic;

public class Room implements Localization {

    private String id;
    private String name;

    private float area;
    private float cube;
    private float heating;
    private float light;

    /**
     * Room constructor
     * @param id
     * @param name
     * @param area
     * @param cube
     * @param heating
     * @param light
     */
    public Room(String id, String name, float area, float cube, float heating, float light) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.cube = cube;
        this.heating = heating;
        this.light = light;
    }

    /**
     * Room constructor
     * @param area
     */

    public Room(float area) {
        this.area = area;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    /**
     * Get area of room
     * @return area of room
     */
    @Override
    public float getArea() {
        return area;
    }
    /**
     * Get cubature of room
     * @return cubature of room
     */
    @Override
    public float getCube() {
        return cube;
    }
    /**
     * Get heating of room
     * @return heating of room
     */
    @Override
    public float getHeating() {
        return heating;
    }
    /**
     * Get lighting of room
     * @return lighting of room
     */
    @Override
    public float getLight() { return light; }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public void setCube(float cube) {
        this.cube = cube;
    }

    public void setHeating(float heating) {
        this.heating = heating;
    }

    public void setLight(float light) {
        this.light = light;
    }
}
