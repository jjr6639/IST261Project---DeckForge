/***
 * Jordan Runyon - JJR6639
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.List;

public class DeckListUI extends JFrame {
    private JList<String> deckList;
    private JButton viewDetailButton;

    public DeckListUI(List<String> deckNames) {
        setTitle("Deck List");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        deckList = new JList<>(deckNames.toArray(new String[0]));
        add(new JScrollPane(deckList), BorderLayout.CENTER);

        viewDetailButton = new JButton("View Details");
        add(viewDetailButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    public void addViewDetailListener(ActionListener listener) {
        viewDetailButton.addActionListener(listener);
    }

    public int getSelectedDeckIndex() {
        return deckList.getSelectedIndex();
    }
}
