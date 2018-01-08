package pl.put.poznan.transformer.rest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.transformer.logic.BuildManage;

import java.util.Arrays;


@RestController
@RequestMapping("/{text}")

/**
 * Controler allowing to manage application via REST
 */
public class BuildManageController {

    private static final Logger logger = LoggerFactory.getLogger(BuildManageController.class);

    /**
     * Handle GET request
     * @param text
     * @param transforms
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public String get(@PathVariable String text,
                              @RequestParam(value="transforms", defaultValue="upper,escape") String[] transforms) {

        // log the parameters
        logger.debug(text);
        logger.debug(Arrays.toString(transforms));

        // do the transformation, you should run your logic here, below just a silly example
        BuildManage transformer = new BuildManage(transforms);
        return transformer.transform(text);
    }

    /**
     * Handle POST request
     * @param text
     * @param transforms
     * @return
     */

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public String post(@PathVariable String text,
                      @RequestBody String[] transforms) {

        // log the parameters
        logger.debug(text);
        logger.debug(Arrays.toString(transforms));

        // do the transformation, you should run your logic here, below just a silly example
        BuildManage transformer = new BuildManage(transforms);
        return transformer.transform(text);
    }



}


