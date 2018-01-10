package pl.put.poznan.transformer.logic;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BuildingService {

    private List<Building> buildings;

    private Building initDemo(){
        Room pokoj1 = new Room("1","room1", 2, 0, 0,0 );
        Room pokoj2 = new Room("2","room2", 4, 0, 0,0);
        Room pokoj3 = new Room("3","room3", 6, 0, 0,0);

        Room pokoj4 = new Room("4","room4", 10, 0, 0,0);
        Room pokoj5 = new Room("5","room5", 4, 0, 0,0);
        Room pokoj6 = new Room("6","room6", 6, 0, 0,0);

        Level level1 = new Level("1", "parter");
        level1.addChild(pokoj1);
        level1.addChild(pokoj2);
        level1.addChild(pokoj3);

        Level level2 = new Level("2", "1pietro");
        level2.addChild(pokoj4);
        level2.addChild(pokoj5);
        level2.addChild(pokoj6);

        Building building = new Building("1", "Szkoła");
        building.addChild(level1);
        building.addChild(level2);

        return building;
    }

    public BuildingService(){
        buildings = new ArrayList<>();
        createBuilding(initDemo());
    }

    public Building createBuilding(Building building){
        buildings.add(building);
        System.out.println(building.toString());
        return building;
    }

    public Building readBuilding(String id){

        Building building = null;
        Building buildingReturn = null;

        for(int i=0; i < buildings.size(); i++){
            building = buildings.get(i);

            if(Integer.parseInt(building.getId()) == Integer.parseInt(id)){
                System.out.println("Found building");
                i = buildings.size() + 1;
                buildingReturn = building;
            }
        }
        return buildingReturn;
    }

}
