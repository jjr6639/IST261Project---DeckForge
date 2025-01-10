/**
 * Jordan Runyon - jjr6639
 */

public class App {
    public static void main(String[] args) {
        DeckController deckController = new DeckController();
        DeckView deckView = new DeckView();

        deckView.addAddListener(e -> {

            String name = deckView.getNameInput();
            String format = deckView.getFormatInput();
            String metaType = deckView.getMetaTypeInput();
            Deck newDeck = new Deck(name, format, metaType);
            deckController.addDeck(newDeck);
            deckView.displayMessage("Deck added: " + name);
            deckView.displayDeckList(deckController.getAllDecks());
        });

        deckView.addSearchListener(e -> {

            String name = deckView.getSearchInput();
            Deck deck = deckController.getDeck(name);
            if (deck != null) {
                deckView.displayMessage("Deck found: " + deck);
            } else {
                deckView.displayMessage("Deck not found.");
            }
        });

        deckView.addRemoveListener(e -> {
            String name = deckView.getSearchInput();

            deckController.removeDeck(name);
            deckView.displayMessage("Deck removed: " + name);
            deckView.displayDeckList(deckController.getAllDecks());
        });

        deckView.displayDeckList(deckController.getAllDecks());
    }
}
