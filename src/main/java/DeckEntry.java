/***
 * JJR6639 - Jordan Runyon
 */

import java.io.Serializable;

public class DeckEntry implements Comparable<DeckEntry>, Serializable {
    private String name;
    private String owner;
    private int powerLevel;
    public DeckEntry(String name, String owner, int powerLevel) {
        this.name = name;
        this.owner = owner;
        this.powerLevel = powerLevel;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    @Override
    public int compareTo(DeckEntry other) {
        return Integer.compare(this.powerLevel, other.powerLevel);
    }
    @Override
    public String toString() {
        return "DeckEntry{name='" + name + "', owner='" + owner + "', powerLevel=" + powerLevel + "}";
    }
}
