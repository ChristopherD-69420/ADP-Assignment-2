/**
 * CollectionInterface.java
 * @author Christopher Doolings (218338376)
 * Date: 16 May 2021
 */

package za.ac.cput.adpassignment;

import java.util.Collection;
import java.util.TreeSet;

public class CollectionsInterface {

    private Collection<String> collection = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);

    public void addCollectionElement(String object) {
        collection.add(object);
    }

    public void removeCollectionElement(String object) {
        collection.remove(object);
    }

    public boolean findCollectionElement(String object) {
        return collection.contains(object);
    }

    public boolean isCollectionEmpty() {
        return collection.isEmpty();
    }

    public int getCollectionSize() {
        return collection.size();
    }

}
