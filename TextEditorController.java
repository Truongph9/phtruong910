package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;

import model.Texteditormodel;
import view.TexteditorView;

public class TextEditorController {
	private Texteditormodel model;
    private TexteditorView view;

    public TextEditorController(Texteditormodel model, TexteditorView view) {
        this.model = model;
        this.view = view;

        view.addLoadButtonListener(new LoadButtonListener());
        view.addSaveButtonListener(new SaveButtonListener());
    }  class LoadButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser fileChooser = new JFileChooser();
            int returnValue = fileChooser.showOpenDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                try {
                    model.loadFromFile(selectedFile);
                    view.setText(String.join("\n", model.getLines()));
                } catch (Exception ex) {
                    ex.printStackTrace();
                    // Handle exception
                }
            }
        }
    }

    class SaveButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser fileChooser = new JFileChooser();
            int returnValue = fileChooser.showSaveDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                try {
                    model.saveToFile(selectedFile);
                } catch (Exception ex) {
                    ex.printStackTrace();
                    // Handle exception
                }
            }
        }
    }
}
