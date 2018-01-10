package pl.put.poznan.transformer.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.transformer.logic.Building;
import pl.put.poznan.transformer.logic.BuildManage;


@RestController
@RequestMapping("/data/{text}")

/**
 * Controler allowing to manage application via REST
 */
public class BuildManageController {

    public BuildManage buildManage;
    private static final Logger logger = LoggerFactory.getLogger(BuildManageController.class);

    @Autowired
    public BuildManageController(BuildManage buildManage) {
        this.buildManage = buildManage;
    }


    /**
     * Handle GET request
     * //     * @param text
     * //     * @param transforms
     *
     * @return
     */

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Building> get(@PathVariable String text,
                                        @RequestParam(value = "id") String id) {

        return ResponseEntity.ok(buildManage.readBuilding(id));
    }

    /**
     * Handle POST request
     *
     * @param text //     * @param transforms
     * @return
     */

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<Void> post(@PathVariable String text,
                                     @RequestParam(value = "building") String building) {
        buildManage.createBuilding(building);
        return null;
    }
}