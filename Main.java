package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class Main extends Application {
	Controle c = new Controle();
	@Override
	public void start(Stage primaryStage) {
		try {
			Pane pageDeGarde = new Pane();
			Scene scene = new Scene(pageDeGarde);
			c.newPage(primaryStage,pageDeGarde,scene,"sudoku");
			
			final ImageView uphf = c.creerImage("/project/image/Logo_UPHF.png",600,200,384,20);
	        pageDeGarde.getChildren().setAll(uphf); 
	        
			Label names = new Label("BETOURNE Aurelien \nBERNIER Thomas \n3 \n4 \nZIANE Sofiane");
			names.getStyleClass().add("names");
			Label presentation = new Label("Bonjour et bienvenue, cette application vous propose de jouer au choix parmis 3 mini-jeux: \n Sudoku , SudokuLettre , MotsFleches , Pendu et Motus");
			presentation.getStyleClass().add("presentation");
			
			Button sign = c.creerBouton("S'inscrire","sign",310,400);
			Button log = c.creerBouton("Se connecter","log",677,400);
		
			Button h = c.creerBouton("Jouer hors ligne","h",310,490);
			h.setOnAction(new EventHandler<ActionEvent>() {
			    public void handle(ActionEvent e) {
			    	choixJeu(primaryStage);
			    }
			});
			
			pageDeGarde.getChildren().addAll(names,presentation,sign,log,h);
			
			primaryStage.setTitle("JavaFX Project");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void choixJeu(Stage stage) {
		Pane p = new Pane();
		Scene scene2 = new Scene(p);
		c.newPage(stage,p,scene2,"ChoixJeu");
        
		final ImageView uphf = c.creerImage("/project/image/Logo_UPHF.png",600,200,384,20);
        p.getChildren().setAll(uphf); 
		
		Button sudoku = c.creerBouton("Sudoku","sudoku",300,250);
		Button lettre = c.creerBouton("Sudoku Lettre","lettre",300,350);
		Button motus = c.creerBouton("Motus","motus",300,450);
		Button pendu = c.creerBouton("Pendu","pendu",300,550);
		Button meles = c.creerBouton("Mots Meles","meles",300,650);

		sudoku.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {	
				/*Sudoku sudoku =*/ new Sudoku(stage);
			}	
		});
		lettre.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {	
				/*Lettre lettre =*/ new Lettre(stage);
			}	
		});/*
		motus.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {	
				motus(stage);
			}	
		});
		pendu.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {	
				pendu(stage);
			}	
		});
		meles.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {	
				meles(stage);
			}	
		});*/
		
		p.getChildren().addAll(sudoku,lettre,motus,pendu,meles);
	}
}

/*
Tooltip toolSign = new Tooltip("Sinscrire");
Tooltip.install(sign, toolSign);*/
/*
final TextField textField = new TextField();
page2.getChildren().addAll(textField);*/
