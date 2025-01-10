/***
 * Jordan Runyon - jjr6639
 * IST 261 - implementing interfaces
 */

import java.util.ArrayList;

interface Playable {
    void play();
    void endTurn();
}
class Spell implements Playable {
    private String spellName;
    private int manaCost;

    public Spell(String spellName, int manaCost) {
        this.spellName = spellName;
        this.manaCost = manaCost;
    }

    @Override
    public void play() {
        System.out.println("Casting spell: " + spellName + " for " + manaCost + " mana.");
    }

    @Override
    public void endTurn() {
        System.out.println("The effects of " + spellName + " have resolved.");
    }

    @Override
    public String toString() {
        return "Spell{spellName='" + spellName + "', manaCost=" + manaCost + "}";
    }
}

// Creature class for implementing Playable interface
class Creature implements Playable {
    private String creatureName;
    private int power;
    private int toughness;

    public Creature(String creatureName, int power, int toughness) {
        this.creatureName = creatureName;
        this.power = power;
        this.toughness = toughness;
    }

    @Override
    public void play() {
        System.out.println("Summoning creature: " + creatureName + " with power " + power + " and toughness " + toughness + ".");
    }

    @Override
    public void endTurn() {
        System.out.println(creatureName + " ends its turn. It remains on the battlefield.");
    }

    @Override
    public String toString() {
        return "Creature{creatureName='" + creatureName + "', power=" + power + ", toughness=" + toughness + "}";
    }
}

public class TestHarness {
    public TestHarness() {
        testInterface();
    }
    public void testInterface() {
        System.out.println("\nTesting Playable Interface...");
        ArrayList<Playable> playableItems = new ArrayList<>();
        Playable fireball = new Spell("Fireball", 5); // Fireball spell with 5 mana cost
        Playable goblin = new Creature("Goblin Warrior", 2, 2); // Creature with 2 power and 2 toughness

        playableItems.add(fireball);
        playableItems.add(goblin);

        for (Playable item : playableItems) {
            System.out.println(item.toString());
            item.play();
            item.endTurn();
        }

        System.out.println("\nPlayable Interface Test Completed.");
    }

    public static void main(String[] args) {
        new TestHarness();
    }
}
