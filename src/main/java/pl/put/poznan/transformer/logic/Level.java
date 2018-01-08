package pl.put.poznan.transformer.logic;

import java.util.ArrayList;

/**
 * Class descsribing level, composed of rooms
 */

public class Level implements Localization {

    private String id;
    private String name;

    private ArrayList<Room> roomList;

    /**
     * Level constructor
     * @param id
     * @param name
     */

    public Level(String id, String name){
        this.id = id;
        this.name = name;
        this.roomList = new ArrayList<Room>();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }

    public void addChild(Room room) {
        roomList.add(room);
    }


    /**
     * Get area of level
     * @return area of level
     */

    @Override
    public float getArea() {
        int wart = 0;
        if (!roomList.isEmpty()){
            for (Room room : roomList){
                if (room instanceof Localization){
                    wart += room.getArea();
                }
            }

        }
        return wart;
    }

    /**
     * Get cubature of level
     * @return cubature of level
     */
    @Override
    public float getCube() {

        int wart = 0;
        if (!roomList.isEmpty()){
            for (Room room : roomList){
                if (room instanceof Localization){
                    wart += room.getCube();
                }
            }
        }
        return wart;
    }

    /**
     * Get heating of level
     * @return heating of level
     */
    @Override
    public float getHeating() {

        int wart = 0;
        if (!roomList.isEmpty()){
            for (Room room : roomList){
                if (room instanceof Localization){
                    wart += room.getHeating();
                }
            }
        }
        return wart;
    }

    /**
     * Get lighting of level
     * @return lighting of level
     */
    @Override
    public float getLight() {

        int wart = 0;
        if (!roomList.isEmpty()){
            for (Room room : roomList){
                if (room instanceof Localization){
                    wart += room.getLight();
                }
            }
        }
        return wart;
    }
}
