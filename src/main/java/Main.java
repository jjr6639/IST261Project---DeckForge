/**
 * Jordan Runyon - jjr6639
 */

import java.util.ArrayList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Card card1 = new Card("Lightning Bolt", "Instant", 1, 3);
        Card card2 = new Card("Llanowar Elves", "Creature", 1, 1);

        TreeSet<Card> cards = new TreeSet<>();
        cards.add(card1);
        cards.add(card2);
        Deck deck = new Deck("Mono-Red Aggro", "Standard", "Aggro");
        deck.setCards(cards);

        UserProfile profile = new UserProfile("Jordan", "Deck builder and MTG player.");
        User user = new User("jordanrunyon", "password123", profile, new ArrayList<>());
        user.getDecks().add(deck);

        System.out.println(user.toString());
    }
}


