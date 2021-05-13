/**
 * ListInterfaceTest.java
 * @author Christopher Doolings (218338376)
 * Date: 16 May 2021
 */

package za.ac.cput.adpassignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class ListInterfaceTest {
    private ListInterface subject;

    @BeforeEach
    void setUp() {
        subject = new ListInterface();
    }

    //This test checks whether elements are being added to the ArrayList
    @Test
    void addElement() {
        subject.addListElement("ADP");
        assertEquals(1, subject.getListSize());
    }

    //This test checks for elements being removed from the ArrayList
    @Test
    void removeElement() {
        subject.addListElement("ADP");
        subject.addListElement("ADT");
        subject.addListElement("ITS");
        subject.addListElement("PRM");

        subject.removeListElement(3);

        assertEquals(subject.getListSize(), 3);
    }

    //This test finds a particular element in the given ArrayList
    @Test
    void findElement() {
        subject.addListElement("ADP");
        subject.addListElement("ADT");
        subject.addListElement("ITS");
        subject.addListElement("PRM");

        assertEquals("ADT", subject.findListElement(0));
    }
}