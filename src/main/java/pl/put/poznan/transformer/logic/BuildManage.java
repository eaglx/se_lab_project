package pl.put.poznan.transformer.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Communication with browser
 */
@Service
public class BuildManage {

    private BuildingService buildingService;

    @Autowired
    public BuildManage(BuildingService buildingService) {
        this.buildingService = buildingService;
    }

    public Building readBuilding(String id) {
        return buildingService.readBuilding(id);
    }

    public Building createBuilding(String building) {
        return buildingService.createBuilding(convertToBuilding(building));
    }

    private Building convertToBuilding(String building) {
        System.out.println(building);
        // TODO: Parse json and create object
        return null;
    }

}
