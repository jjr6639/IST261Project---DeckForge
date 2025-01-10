/**
 * Jordan Runyon - jrr6639
 */

import java.util.TreeSet;

public class DeckController {
    private TreeSet<Deck> deckSet;

    public DeckController() {
        deckSet = new TreeSet<>();
        initializeDecks();
    }

    private void initializeDecks() {
        Deck deck1 = new Deck("Mono-Red Aggro", "Standard", "Aggro");
        deck1.addCard(new Card("Lightning Bolt", "Instant", 1, 3));
        deck1.addCard(new Card("Shock", "Instant", 1, 2));

        Deck deck2 = new Deck("Mono-Green Ramp", "Modern", "Ramp");
        deck2.addCard(new Card("Llanowar Elves", "Creature", 1, 1));
        deck2.addCard(new Card("Nissa, Who Shakes the World", "Planeswalker", 6, 5));

        deckSet.add(deck1);
        deckSet.add(deck2);
    }

    public void addDeck(Deck deck) {
        deckSet.add(deck);
    }

    public void removeDeck(String deckName) {
        deckSet.removeIf(deck -> deck.getName().equals(deckName));
    }

    public Deck getDeck(String deckName) {
        for (Deck deck : deckSet) {
            if (deck.getName().equals(deckName)) {
                return deck;
            }
        }
        return null;
    }

    public TreeSet<Deck> getAllDecks() {
        return deckSet;
    }
}
