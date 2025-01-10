import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DeckList implements Serializable {
    private List<Deck> decks;

    public DeckList() {
        decks = new ArrayList<>();
    }

    public void addDeck(Deck deck) {
        decks.add(deck);
    }

    public List<Deck> getDecks() {
        return decks;
    }

    public boolean isEmpty() {
        return decks.isEmpty();
    }

    public List<String> getDeckNames() {
        List<String> deckNames = new ArrayList<>();
        for (Deck deck : decks) {
            deckNames.add(deck.getName());
        }
        return deckNames;
    }

    public Deck getDeck(int index) {
        return decks.get(index);
    }

    public void deleteDeck(int index) {
        decks.remove(index);
    }

    public void updateDeck(int index, Deck deck) {
        decks.set(index, deck);
    }
}
