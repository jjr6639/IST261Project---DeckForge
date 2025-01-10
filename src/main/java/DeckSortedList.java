/**
 * JJR6639
 */
import java.util.LinkedList;

public class DeckSortedList {
    private LinkedList<DeckEntry> deckList;

    public DeckSortedList() {
        deckList = new LinkedList<>();
    }
    public void addItem(DeckEntry newDeck) {
        int index = 0;
        for (DeckEntry deck : deckList) {
            if (newDeck.getName().compareTo(deck.getName()) < 0) {
                break;
            }
            index++;
        }
        deckList.add(index, newDeck);
    }

    public void removeItem(DeckEntry deckToRemove) {
        deckList.remove(deckToRemove);
    }

    public DeckEntry getItem(String name) {
        for (DeckEntry deck : deckList) {
            if (deck.getName().equals(name)) {
                return deck;
            }
        }
        return null;
    }
    public void printDeckList() {
        System.out.println("Deck List:");

        for (DeckEntry deck : deckList) {
            System.out.println(deck);
        }
    }
}

