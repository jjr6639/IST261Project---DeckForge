/**
 * Jordan Runyon - jjr6639
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {
    private Deck deck;
    private Card card1;
    private Card card2;
    private TreeSet<Card> cards;

    @BeforeEach
    void setUp() {
        card1 = new Card("Lightning Bolt", "Instant", 1, 3);
        card2 = new Card("Llanowar Elves", "Creature", 1, 1);

        cards = new TreeSet<>();
        cards.add(card1);
        cards.add(card2);

        deck = new Deck("Mono-Red Aggro", "Standard", "Aggro");
        deck.setCards(cards);
    }

    @Test
    void testGetName() {
        assertEquals("Mono-Red Aggro", deck.getName());
    }

    @Test
    void testSetCards() {
        TreeSet<Card> newCards = new TreeSet<>();
        newCards.add(new Card("Forest", "Land", 0, 0));
        deck.setCards(newCards);
        assertEquals(newCards, deck.getCards());
    }

    @Test
    void testAddCard() {
        Card newCard = new Card("Forest", "Land", 0, 0);
        deck.addCard(newCard);
        assertTrue(deck.getCards().contains(newCard));
    }

    @Test
    void testRemoveCard() {
        deck.removeCard(card1);
        assertFalse(deck.getCards().contains(card1));
    }

    @Test
    void testToString() {
        String expected = "Deck{name='Mono-Red Aggro', format='Standard', metaType='Aggro', cards=" + cards + "}";
        assertEquals(expected, deck.toString());
    }
}
