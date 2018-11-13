package application;

import java.util.ArrayList;

import javafx.stage.Stage;

public class Lettre extends Sudoku{
	
	public Lettre(Stage stage) {
		super(stage);
		// TODO Auto-generated constructor stub
	}

	public ArrayList<String> valPadd(){
		ArrayList<String> val = new ArrayList<String>(9);
		val.add("A"); 
		val.add("B"); 
		val.add("C"); 
		val.add("D"); 
		val.add("E");
		val.add("F");
		val.add("G");
		val.add("H");
		val.add("I");
		
		return val;
	}
}
