import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class DeckUI extends JFrame {
    private JTextField nameField;
    private JTextField formatField;
    private JTextField metaTypeField;
    private JTextField cardCountField;
    private JButton prevButton, nextButton, addButton, updateButton, deleteButton, quitButton;

    public DeckUI() {
        setTitle("MTG Deck Sharing");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

        prevButton = new JButton("Previous");
        nextButton = new JButton("Next");
        addButton = new JButton("Add");
        updateButton = new JButton("Update");
        deleteButton = new JButton("Delete");
        quitButton = new JButton("Quit");

        add(prevButton);
        add(nextButton);
        add(addButton);
        add(updateButton);
        add(deleteButton);
        add(quitButton);

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
    public void addPrevListener(ActionListener listenForPrevButton) {
        prevButton.addActionListener(listenForPrevButton);
    }

    public void addNextListener(ActionListener listenForNextButton) {
        nextButton.addActionListener(listenForNextButton);
    }

    public void addAddListener(ActionListener listenForAddButton) {
        addButton.addActionListener(listenForAddButton);
    }

    public void addUpdateListener(ActionListener listenForUpdateButton) {
        updateButton.addActionListener(listenForUpdateButton);
    }

    public void addDeleteListener(ActionListener listenForDeleteButton) {
        deleteButton.addActionListener(listenForDeleteButton);
    }

    public void addQuitListener(ActionListener listenForQuitButton) {
        quitButton.addActionListener(listenForQuitButton);
    }
}

