package Test;

import controller.TextEditorController;
import model.Texteditormodel;
import view.TexteditorView;

public class Test {
	public static void main(String[] args) {
		Texteditormodel model = new Texteditormodel();
		TexteditorView view = new TexteditorView();
		TextEditorController controller = new TextEditorController(model, view);
		
		view.setVisible(true);
	}

}
