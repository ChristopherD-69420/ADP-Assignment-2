/**
 * MapInterfaceTest.java
 * @author Christopher Doolings (218338376)
 * Date: 16 May 2021
 */

package za.ac.cput.adpassignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MapInterfaceTest {
    private MapInterface employeeSalary;

    @BeforeEach
    void setUp() {
        employeeSalary = new MapInterface();
    }

    //This test checks whether elements are being added to the HashMap
    @Test
    void addMapElement() {
        employeeSalary.addMapElement("John", 150000.00);
        employeeSalary.addMapElement("Jane", 300000.00);

        assertFalse(employeeSalary.isMapEmpty());
    }

    //This test checks for elements being removed from a HashMap
    @Test
    void removeMapElement() {
        employeeSalary.addMapElement("John", 150000.00);
        employeeSalary.addMapElement("Jane", 300000.00);

        employeeSalary.removeMapElement("John");
        assertEquals(1, employeeSalary.getMapSize());

        employeeSalary.removeMapElement("Jane");
        assertEquals(0, employeeSalary.getMapSize());
    }

    //This test finds a particular element in the given HashMap
    @Test
    void findMapElement() {
        employeeSalary.addMapElement("John", 150000.00);
        employeeSalary.addMapElement("Jane", 300000.00);
        employeeSalary.addMapElement("Riley", 60000.00);
        employeeSalary.addMapElement("Alistar", 90000.00);

        assertTrue(employeeSalary.findMapElement("Alistar"));
    }
}