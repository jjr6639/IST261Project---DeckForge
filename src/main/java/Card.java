/**
 * Jordan Runyon - jjr6639
 */

import java.io.Serializable;

public class Card implements Serializable, Comparable<Card> {
    private String name;
    private String type;
    private int manaCost;
    private int powerLevel;

     public Card(String name, String type, int manaCost, int powerLevel) {
        this.name = name;
        this.type = type;
        this.manaCost = manaCost;
        this.powerLevel = powerLevel;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getManaCost() {
        return manaCost;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    @Override
    public int compareTo(Card other) {
         if (other == null) return 1;

         return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Card{name='" + name + "', type='" + type + "', manaCost=" + manaCost + ", powerLevel=" + powerLevel + "}";
    }
}
