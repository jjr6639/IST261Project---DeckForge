/**
 * Jordan Runyon - jjr6639
 */

import java.util.HashMap;

public class DeckManager {
    private HashMap<String, Deck> deckMap;

    public DeckManager() {
        deckMap = new HashMap<>();
        initializeTestData();
    }

    private void initializeTestData() {
        addDeck(new Deck("Mono-Red Aggro", "Standard", "Aggro"));
        addDeck(new Deck("Dimir Control", "Modern", "Control"));
        addDeck(new Deck("Five-Color Slivers", "Commander", "Combo"));
    }

    public void addDeck(Deck deck) {
        deckMap.put(deck.getName(), deck);
    }

    public Deck getDeck(String name) {
        return deckMap.get(name);
    }

    public void removeDeck(String name) {
        deckMap.remove(name);
    }

    public HashMap<String, Deck> getDecks() {
        return deckMap;
    }
}
