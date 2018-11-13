package application;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Controle {
	
	public void newPage(Stage s, Pane p, Scene scene,String titre) {
		s.hide();
    	s.setFullScreen(true);
		p.getStyleClass().add("pageDeGarde");
		s.setTitle(titre);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		s.setScene(scene);
		s.show();
	}
	
	public Button creerBouton(String nom,String css,double x,double y) {
		Button b = new Button(nom);
		b.getStyleClass().add(css);
		b.setLayoutX(x);
		b.setLayoutY(y);
		
		return b;
	}
	
	public ImageView creerImage(String url,double dimX,double dimY,double posX,double posY) {
		final java.net.URL imageURL = getClass().getResource(url);  
		final Image image = new Image(imageURL.toExternalForm());
		final ImageView imageView = new ImageView(image);
		
		imageView.setFitWidth(dimX); 
        imageView.setFitHeight(dimY);
        imageView.setLayoutX(posX);
        imageView.setLayoutY(posY);
        
        return imageView;
	}
}
