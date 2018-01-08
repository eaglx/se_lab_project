package pl.put.poznan.transformer.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.put.poznan.transformer.logic.Building;
import pl.put.poznan.transformer.logic.Level;
import pl.put.poznan.transformer.logic.Room;


@SpringBootApplication(scanBasePackages = {"pl.put.poznan.transformer.rest"})
/**
 * Main class of application helping in build management
 */
public class BuildManageApplication {

    /**
     * Main
     * @param args
     */
    public static void main(String[] args) {

        Room pokoj1 = new Room(2);
        Room pokoj2 = new Room(4);
        Room pokoj3 = new Room(6);

        Room pokoj4 = new Room(10);
        Room pokoj5 = new Room(4);
        Room pokoj6 = new Room(6);

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

        System.out.println(building.getCube());
        SpringApplication.run(BuildManageApplication.class, args);
    }
}
