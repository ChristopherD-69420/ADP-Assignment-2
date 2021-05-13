/**
 * SetInterfaceTest.java
 * @author Christopher Doolings (218338376)
 * Date: 16 May 2021
 */

package za.ac.cput.adpassignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetInterfaceTest {
    private SetInterface countries;

    @BeforeEach
    void setUp() {
        countries = new SetInterface();
    }

    //This test checks for new elements being added to the HashSet
    @Test
    void addSetElement() {
        countries.addSetElement("Dubai");
        countries.addSetElement("Australia");
        countries.addSetElement("Netherlands");

        assertEquals(1, countries.getSetSize());
    }

    //This test removes an element from the given HashSet
    @Test
    void removeSetElement() {
        countries.addSetElement("Dubai");
        countries.addSetElement("Australia");
        countries.addSetElement("Netherlands");

        countries.removeSetElement("Dubai");

        assertEquals(3, countries.getSetSize());
    }

    //This test finds a particular element in the given HashSet
    @Test
    void findSetElement() {
        countries.addSetElement("Dubai");
        countries.addSetElement("Australia");
        countries.addSetElement("Netherlands");
        countries.addSetElement("South Africa");

        assertFalse(countries.findSetElement("USA"));
    }
}