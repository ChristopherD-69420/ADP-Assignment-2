/**
 * SetInterface.java
 * @author Christopher Doolings (218338376)
 * Date: 16 May 2021
 */

package za.ac.cput.adpassignment;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {
    private Set<String> set = new HashSet<>();

    public void addSetElement(String object) {
        set.add(object);
    }

    public void removeSetElement(String object) {
        set.remove(object);
    }

    public boolean findSetElement(String object) {
        return set.contains(object);
    }

    public int getSetSize() {
        return set.size();
    }
}
