/**
 * ListInterface.java
 * @author Christopher Doolings (218338376)
 * Date: 16 May 2021
 */

package za.ac.cput.adpassignment;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {

    private List<String> list = new ArrayList<>();

    public void addListElement(String object) {
        list.add(object);
    }

    public void removeListElement(int index) {
        list.remove(index);
    }

    public String findListElement(int index) {
        return list.get(index);
    }

    public int getListSize() {
        return list.size();
    }

}

