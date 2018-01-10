package pl.put.poznan.transformer.logic

import org.junit.Before
import org.junit.Test
import pl.put.poznan.transformer.logic.Building
import pl.put.poznan.transformer.logic.Level
import pl.put.poznan.transformer.logic.Room

import static org.junit.Assert.assertEquals

class BuildingTest extends GroovyTestCase {
    private Building building;

    private Room pokoj1;
    private Room pokoj4;

    private Level level1;
    private Level level2;

    @Before
    void setUp() {
        pokoj1 = new Room("1", "pokoj1", 2, 3, 4, 5);
        pokoj4 = new Room("2", "pokoj2", 2, 3, 4, 5);

        level1 = new Level("1", "parter");
        level2 = new Level("2", "1pietro");

        building = new Building("1", "Szkoła");

        level1.addChild(pokoj1);
        level2.addChild(pokoj4);
        building.addChild(level1);
        building.addChild(level2);

    }

    @Test
    public void testAddChild()
    {

        org.junit.Assert.assertEquals(2, building.getLevelList().size());
    }

    @Test
    public void testGetCube()
    {
        assertEquals(6.0, building.getCube(), 0.01);
    }

    @Test
    public void testGetArea()
    {
        assertEquals(4.0, building.getArea(), 0.01);
    }

    @Test
    public void testGetHeating()
    {
        assertEquals(8.0, building.getHeating(), 0.01);
    }

    @Test
    public void testGetLighy()
    {
        assertEquals(10.0, building.getLight(), 0.01);
    }



}

