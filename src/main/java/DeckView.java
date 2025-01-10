/**
 * Jordan Runyon - jjr6639
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.TreeSet;

public class DeckView extends JFrame {
    private JTextField nameField, formatField, metaTypeField, searchField;
    private JTextArea displayArea;
    private JButton addButton, searchButton, removeButton;

    public DeckView() {
        setTitle("Deck Manager");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(3, 2));
        inputPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("Format:"));
        formatField = new JTextField();
        inputPanel.add(formatField);

        inputPanel.add(new JLabel("Meta Type:"));
        metaTypeField = new JTextField();
        inputPanel.add(metaTypeField);

        addButton = new JButton("Add Deck");
        inputPanel.add(addButton);
        add(inputPanel, BorderLayout.NORTH);

        JPanel searchPanel = new JPanel(new FlowLayout());
        searchPanel.add(new JLabel("Search by Name:"));
        searchField = new JTextField(10);
        searchPanel.add(searchField);

        searchButton = new JButton("Search");
        searchPanel.add(searchButton);

        removeButton = new JButton("Remove");
        searchPanel.add(removeButton);

        add(searchPanel, BorderLayout.CENTER);

        displayArea = new JTextArea();
        displayArea.setEditable(false);
        add(new JScrollPane(displayArea), BorderLayout.SOUTH);

        setVisible(true);
    }

    public String getNameInput() {
        return nameField.getText();
    }

    public String getFormatInput() {
        return formatField.getText();
    }

    public String getMetaTypeInput() {
        return metaTypeField.getText();
    }

    public String getSearchInput() {
        return searchField.getText();
    }

    public void displayMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    public void displayDeckList(TreeSet<Deck> deckSet) {
        displayArea.setText("Deck List:\n");
        for (Deck deck : deckSet) {
            displayArea.append(deck.getName() + "\n");
        }
    }

    public void addAddListener(ActionListener listener) {
        addButton.addActionListener(listener);
    }

    public void addSearchListener(ActionListener listener) {
        searchButton.addActionListener(listener);
    }

    public void addRemoveListener(ActionListener listener) {
        removeButton.addActionListener(listener);
    }
}
