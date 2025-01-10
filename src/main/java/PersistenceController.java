/**
 * Jordan Runyon - jjr6639
 */

import java.io.*;

public class PersistenceController {
    private static final String FILE_PATH = "decklist.ser";

    public DeckList loadDeckList() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            return (DeckList) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("No existing data file found. Starting with a new deck list.");
            return new DeckList();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new DeckList();
        }
    }

    public void saveDeckList(DeckList deckList) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(deckList);


            System.out.println("Deck list saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
