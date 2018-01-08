package pl.put.poznan.transformer.logic;

import java.util.ArrayList;

/**
 * Class describing building object, composed of levels
 */

public class Building implements Localization {
    private String id;
    private String name;

    private ArrayList<Level> levelList;

    /**
     * Building constructor
     * @param id
     * @param name
     */

    public Building(String id, String name){
        this.id = id;
        this.name = name;
        this.setLevelList(new ArrayList<Level>());
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }

    public void addChild(Level level) {
        getLevelList().add(level);
    }

    /**
     * Get area of building
     * @return area of building
     */

    @Override
    public float getArea() {
        int wart = 0;
        if (!getLevelList().isEmpty()){
            for (Level level : getLevelList()){
                if (level instanceof Localization){
                    wart += level.getArea();
                }
            }

        }
        return wart;
    }

    /**
     * Get cubature of building
     * @return cubature of building
     */

    @Override
    public float getCube() {
        int wart = 0;
        if (!getLevelList().isEmpty()){
            for (Level level : getLevelList()){
                if (level instanceof Localization){
                    wart += level.getCube();
                }
            }

        }
        return wart;
    }

    /**
     * Get heating of building
     * @return heating of building
     */

    @Override
    public float getHeating() {

        int wart = 0;
        if (!getLevelList().isEmpty()){
            for (Level level : getLevelList()){
                if (level instanceof Localization){
                    wart += level.getHeating();
                }
            }

        }
        return wart;
    }

    /**
     * Get lighting of building
     * @return lighting of building
     */

    @Override
    public float getLight() {

        int wart = 0;
        if (!getLevelList().isEmpty()){
            for (Level level : getLevelList()){
                if (level instanceof Localization){
                    wart += level.getLight();
                }
            }

        }
        return wart;
    }


    public ArrayList<Level> getLevelList() {
        return levelList;
    }


    public void setLevelList(ArrayList<Level> levelList) {
        this.levelList = levelList;
    }
}
