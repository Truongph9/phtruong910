package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import model.Texteditormodel;

public class TexteditorView  extends JFrame {
	  private JTextArea textArea;
	    private JButton loadButton;
	    private JButton saveButton;

	    public TexteditorView() {
	        this.setTitle("Text Editor");
	        this.setSize(600, 400);
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.setLocationRelativeTo(null);

	        textArea = new JTextArea();
	        JScrollPane scrollPane = new JScrollPane(textArea);
	        add(scrollPane, BorderLayout.CENTER);

	        JPanel buttonPanel = new JPanel();
	        loadButton = new JButton("Load");
	        saveButton = new JButton("Save");
	        buttonPanel.add(loadButton);
	        buttonPanel.add(saveButton);
	        add(buttonPanel, BorderLayout.SOUTH);
	        this.setVisible(true);
	    }

	    public String getText() {
	        return textArea.getText();
	    }

	    public void setText(String text) {
	        textArea.setText(text);
	    }

	    public void addLoadButtonListener(ActionListener listener) {
	        loadButton.addActionListener(listener);
	    }

	    public void addSaveButtonListener(ActionListener listener) {
	        saveButton.addActionListener(listener);
	    }
}
