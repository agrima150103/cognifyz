import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class SimpleNotepad {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Notepad");
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);

        JButton saveButton = new JButton("Save");
        JButton clearButton = new JButton("Clear");

        saveButton.addActionListener(e -> {
            try {
                FileWriter writer = new FileWriter("notepad_output.txt");
                writer.write(textArea.getText());
                writer.close();
                JOptionPane.showMessageDialog(frame, "File saved as notepad_output.txt");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(frame, "Error saving file");
            }
        });

        clearButton.addActionListener(e -> textArea.setText(""));

        JPanel panel = new JPanel();
        panel.add(saveButton);
        panel.add(clearButton);

        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(panel, BorderLayout.SOUTH);

        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
