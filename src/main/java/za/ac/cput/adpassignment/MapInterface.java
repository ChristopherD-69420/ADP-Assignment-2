/**
 * MapInterface.java
 * @author Christopher Doolings (218338376)
 * Date: 16 May 2021
 */

package za.ac.cput.adpassignment;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    private Map<String, Double> map = new HashMap<>();

    public void addMapElement(String name, Double salary) {
        map.put(name, salary);
    }

    public void removeMapElement(String name) {
        map.remove(name);
    }

    public boolean findMapElement(String name) {
        return map.containsKey(name);
    }

    public int getMapSize() {
        return map.size();
    }

    public boolean isMapEmpty() {
        return map.isEmpty();
    }
}
