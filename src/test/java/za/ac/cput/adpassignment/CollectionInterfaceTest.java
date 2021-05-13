/**
 * CollectionInterfaceTest.java
 * @author Christopher Doolings (218338376)
 * Date: 16 May 2021
 */

package za.ac.cput.adpassignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CollectionInterfaceTest {
    private CollectionInterface student;

    @BeforeEach
    void setUp() {
      student = new CollectionInterface();
    }

    //This test checks whether elements are being added to a TreeSet
    @Test
    void addElement() {
        student.addCollectionElement("John");
        student.addCollectionElement("Mary");
        student.addCollectionElement("Jewel");
        student.addCollectionElement("Ruben");

        assertFalse(student.isCollectionEmpty());
    }

    //This test checks for elements being removed from a TreeSet
    @Test
    void removeElement() {
        student.addCollectionElement("John");
        student.addCollectionElement("Mary");
        student.addCollectionElement("Precious");
        student.addCollectionElement("Ruben");
        int size = student.getCollectionSize();

        student.removeCollectionElement("Mary");

        assertEquals(size, student.getCollectionSize());

    }

    //This test finds a particular element in a TreeSet
    @Test
    void findElement() {
        student.addCollectionElement("John");
        student.addCollectionElement("Mary");
        student.addCollectionElement("Jewel");
        student.addCollectionElement("Ruben");

        assertTrue(student.findCollectionElement("Mary"));
    }
}