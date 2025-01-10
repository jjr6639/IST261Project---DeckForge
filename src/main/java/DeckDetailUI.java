/**
 * Jordan Runyon - JJR6639
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class DeckDetailUI extends JFrame {
    private JTextField nameField;
    private JTextField formatField;
    private JTextField metaTypeField;
    private JTextField cardCountField;
    private JButton saveButton, deleteButton, addButton;

    public DeckDetailUI() {
        setTitle("Deck Details");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(5, 2));
        add(new JLabel("Deck Name:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Format:"));
        formatField = new JTextField();
        add(formatField);

        add(new JLabel("Meta Type:"));
        metaTypeField = new JTextField();
        add(metaTypeField);

        add(new JLabel("Card Count:"));
        cardCountField = new JTextField();
        add(cardCountField);

        saveButton = new JButton("Save Changes");
        addButton = new JButton("Add Deck");
        deleteButton = new JButton("Delete Deck");

        add(saveButton);
        add(addButton);
        add(deleteButton);

        setVisible(true);
    }

    public String getNameField() {
        return nameField.getText();
    }

    public String getFormatField() {
        return formatField.getText();
    }

    public String getMetaTypeField() {
        return metaTypeField.getText();
    }

    public String getCardCountField() {
        return cardCountField.getText();
    }
    public void setNameField(String name) {
        nameField.setText(name);
    }

    public void setFormatField(String format) {
        formatField.setText(format);
    }

    public void setMetaTypeField(String metaType) {
        metaTypeField.setText(metaType);
    }

    public void setCardCountField(String cardCount) {
        cardCountField.setText(cardCount);
    }
    public void addSaveListener(ActionListener listener) {
        saveButton.addActionListener(listener);
    }

    public void addAddListener(ActionListener listener) {
        addButton.addActionListener(listener);
    }
    public void addDeleteListener(ActionListener listener) {
        deleteButton.addActionListener(listener);
    }
}
