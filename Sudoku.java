package application;

import java.util.ArrayList;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Sudoku extends Controle {
	Button[][] grille = new Button[9][9];

	public Sudoku(Stage stage) {
		super();
		Pane p = new Pane();
		Scene scene2 = new Scene(p);
		Button saisie[][] = new Button[3][3];
		ArrayList<String> nums = valPadd();
		saisie = genererSaisie(p,nums);
		newPage(stage,p,scene2,"sudoku");
		grille = genererGrille(p,saisie);	
	}
	
	public ArrayList<String> valPadd(){
		ArrayList<String> val = new ArrayList<String>(9);
		val.add("1"); 
		val.add("2"); 
		val.add("3"); 
		val.add("4"); 
		val.add("5");
		val.add("6");
		val.add("7");
		val.add("8");
		val.add("9");
		
		return val;
	}
	
	public Button[][] genererGrille(Pane p,Button[][] saisie){
		Button grille[][] = new Button[9][9];
		for(int i=0; i<9; i++) {
			for(int j=0;j<9;j++) {
				if(i==2 || i==5) {
					if(j==2 || j==5) {
						grille[i][j] = creerBouton("  ","case1",(64*(i+1))+10,(70*(j+1))+5);
					}
					else {
						grille[i][j] = creerBouton("  ","case2",(64*(i+1))+10,(70*(j+1))+5);
					}
				}
				else if(j==2 || j==5) {
					grille[i][j] = creerBouton("  ","case3",(64*(i+1))+10,(70*(j+1))+5);
				
				}
				else {
					grille[i][j] = creerBouton("  ","case",(64*(i+1))+10,(70*(j+1))+5);
				}
				grille[i][j] = addAction(grille[i][j],saisie);
				grille[i][j].setMinWidth(64);
				grille[i][j].setMaxWidth(64);
				p.getChildren().addAll(grille[i][j]);
			}
		}
		return grille;
	}
	
	public Button[][] genererSaisie(Pane p, ArrayList<String> liste) {
		Button saisie[][] = new Button[4][3];
		for(int i=0; i<3; i++) {
			for(int j=0;j<3;j++) {
				saisie[i][j] = creerBouton(liste.get((j*3)+(i)),"case",(64*(i+1))+800,(70*(j+1))+5);
				p.getChildren().addAll(saisie[i][j]);
				saisie[i][j].setMinWidth(64);
				saisie[i][j].setMaxWidth(64);
				saisie[i][j].setMinHeight(70);
				saisie[i][j].setMaxHeight(70);
			}
		}
		saisie[3][1] = creerBouton("X","case",(64*(1+1))+800,(72*(3+1))+5);
		p.getChildren().addAll(saisie[3][1]);
		return saisie;
	}
	
	public Button clicPad(Button s,Button b) {
		s.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent e) {
				b.setStyle("-fx-background-color: white;");
				if(s.getText().equals("X")) {
					b.setText("  ");
				}
				else {
					b.setText(s.getText());
				}	
			}
		});
		return s;
	}
	
	public Button addAction(Button b,Button[][] s) {
		b.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				b.setStyle("-fx-effect: dropshadow( gaussian , rgba(0,0,0,0.7) , 10,0,0,1 ); \r\n" + 
						"    -fx-effect: innershadow( gaussian , rgba(0,0,0,0.7) , 20,0,0,0 );");
				for(int i=0; i<3; i++) {
					for(int j=0;j<3;j++) {
						s[i][j] = clicPad(s[i][j],b);
					}
				}
				s[3][1] = clicPad(s[3][1],b);
			}
		});
		return b;
	}
}
