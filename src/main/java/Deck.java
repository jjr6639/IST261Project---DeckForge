/***
 * Jordan Runyon - jjr6639
 */

import java.io.Serializable;
import java.util.TreeSet;



public class Deck implements Serializable, Comparable<Deck> {
    private static final long serialVersionUID = 1L;

    private String name;
    private String format;
    private String metaType;
    private TreeSet<Card> cards;

    public Deck(String name, String format, String metaType) {
        if (name == null || format == null || metaType == null) {
            throw new IllegalArgumentException("Deck parameters can not be null");
        }
        this.name = name;
        this.format = format;
        this.metaType = metaType;
        this.cards = new TreeSet<>();
    }

    public String getName() {
        return name;
    }

    public String getFormat() {
        return format;
    }

    public String getMetaType() {
        return metaType;
    }

    public TreeSet<Card> getCards() {
         return cards;
    }

    public void setCards(TreeSet<Card> cards) {
        if (cards == null) {
            throw new IllegalArgumentException("Cards can not be null");
        }

        this.cards = cards;
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }

    public void removeCard(Card card) {
        this.cards.remove(card);
    }

    @Override
       public int compareTo(Deck other) {
        if (other == null) return 1;
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Deck{name='" + name + "', format='" + format + "', metaType='" + metaType + "', cards=" + cards + "}";
    }
}
