package model;

import java.io.File;
import java.util.List;

public class Texteditormodel {
	private List<String> line;
	private File file;
	public Texteditormodel(List<String> line, File file) {
		this.line = line;
		this.file = file;
	}
	public List<String> getLine() {
		return line;
	}
	public void setLine(List<String> line) {
		this.line = line;
	}
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	
	
	
	
	
	

}
