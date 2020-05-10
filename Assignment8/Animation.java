package homework8;

import javafx.animation.FadeTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Sphere;
import javafx.scene.transform.Rotate;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Animation extends Application {
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		
		VBox root = new VBox();
		
		Menu menu = new Menu("File");
		Menu cylinderMenu = new Menu("Cylinder");
		Menu sphereMenu = new Menu("Sphere");
		Menu boxMenu = new Menu("Box");
		Menu hexagonMenu = new Menu("Hexagon");
		
		MenuItem sphRotate = new MenuItem("Rotate");
		MenuItem sphScale = new MenuItem("Scale");
		MenuItem sphSequential = new MenuItem("Sequential");
		
		MenuItem cylRotate = new MenuItem("Rotate");
		MenuItem cylScale = new MenuItem("Scale");
		MenuItem cylSequential = new MenuItem("Sequential");
		
		MenuItem boxRotate = new MenuItem("Rotate");
		MenuItem boxScale = new MenuItem("Scale");
		MenuItem boxSequential = new MenuItem("Sequential");
		
		MenuItem hexRotate = new MenuItem("Rotate");
		MenuItem hexScale = new MenuItem("Scale");
		MenuItem hexFade = new MenuItem("Fade");
		MenuItem hexSequential = new MenuItem("Sequential");
		
		sphereMenu.getItems().add(sphRotate);
		sphereMenu.getItems().add(sphScale);
		sphereMenu.getItems().add(sphSequential);
		
		cylinderMenu.getItems().add(cylRotate);
		cylinderMenu.getItems().add(cylScale);
		cylinderMenu.getItems().add(cylSequential);
		
		boxMenu.getItems().add(boxRotate);		
		boxMenu.getItems().add(boxScale);
		boxMenu.getItems().add(boxSequential);
		
		hexagonMenu.getItems().add(hexRotate);
		hexagonMenu.getItems().add(hexScale);
		hexagonMenu.getItems().add(hexFade);
		hexagonMenu.getItems().add(hexSequential);
		
		menu.getItems().add(sphereMenu);
		menu.getItems().add(cylinderMenu);
		menu.getItems().add(boxMenu);
		menu.getItems().add(hexagonMenu);
		
		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().add(menu);
		
		PhongMaterial ph1 = new PhongMaterial();
		ph1.setDiffuseColor(Color.BLUE);
		PhongMaterial ph2 = new PhongMaterial();
		ph2.setDiffuseColor(Color.ORANGE);
		PhongMaterial ph3 = new PhongMaterial();
		ph3.setDiffuseColor(Color.RED);
		
		TilePane tile = new TilePane();	
		tile.setPrefColumns(2);
		
		Sphere s = new Sphere();
		s.setRadius(40);
		s.setMaterial(ph1);
		
		HBox h1 = new HBox();
		h1.setMinSize(200, 200);
		h1.setAlignment(Pos.CENTER);
		h1.getChildren().add(s);
		h1.setStyle("-fx-border-color: black; -fx-border-width: 1;");
		
		Cylinder c = new Cylinder();
		c.setRadius(30);
		c.setHeight(80);
		c.setMaterial(ph2);
	
		HBox h2 = new HBox();
		h2.setMinSize(200, 200);
		h2.setAlignment(Pos.CENTER);
		h2.getChildren().add(c);
		h2.setStyle("-fx-border-color: black; -fx-border-width: 1;");
		
		Box b = new Box();
		b.setWidth(80);
		b.setHeight(80);
		b.setDepth(80);
		b.setMaterial(ph3);
		
		HBox h3 = new HBox();
		h3.setMinSize(200, 200);
		h3.setAlignment(Pos.CENTER);
		h3.getChildren().add(b);  
		h3.setStyle("-fx-border-color: black; -fx-border-width: 1;");
		
		Polygon hex = new Polygon();
		hex.getPoints().addAll(new Double[] {
				80.0, 0.0,
				140.0, 0.0,
				170.0, 50.0,
				140.0, 100.0,
				80.0, 100.0,
				50.0, 50.0		
		});
		hex.setFill(Color.GREEN);
		HBox h4 = new HBox();
		h4.setMinSize(200, 200);
		h4.setAlignment(Pos.CENTER);
		h4.getChildren().add(hex);
		h4.setStyle("-fx-border-color: black; -fx-border-width: 1;");
		
		tile.getChildren().addAll(h1, h2, h3, h4);
		
		RotateTransition r1 = new RotateTransition();
		r1.setDuration(Duration.millis(2000));
		r1.setNode(s);
		r1.setByAngle(360);
		r1.setCycleCount(1);
		r1.setAutoReverse(false);
		r1.setAxis(Rotate.Y_AXIS);
		RotateTransition r2 = new RotateTransition();
		r2.setDuration(Duration.millis(2000));
		r2.setNode(c);
		r2.setByAngle(360);
		r2.setCycleCount(1);
		r2.setAutoReverse(false);
		r2.setAxis(Rotate.X_AXIS);
		RotateTransition r3 = new RotateTransition();
		r3.setDuration(Duration.millis(2000));
		r3.setNode(b);
		r3.setByAngle(360);
		r3.setCycleCount(1);
		r3.setAutoReverse(false);
		r3.setAxis(Rotate.Y_AXIS);
		RotateTransition r4 = new RotateTransition(); 
		r4.setDuration(Duration.millis(2000));
		r4.setNode(hex);
		r4.setByAngle(360);
		r4.setCycleCount(1);
		r4.setAutoReverse(false);
		
		ScaleTransition s1 = new ScaleTransition();
		s1.setDuration(Duration.millis(2000));
		s1.setNode(s);
		s1.setByX(1.5);
		s1.setByY(1.5);
		s1.setByZ(1.5);
		s1.setCycleCount(2);
		s1.setAutoReverse(true);
		ScaleTransition s2 = new ScaleTransition();
		s2.setDuration(Duration.millis(2000));
		s2.setNode(c);
		s2.setByX(1.5);
		s2.setByY(1.5);
		s2.setByZ(1.5);
		s2.setCycleCount(2);
		s2.setAutoReverse(true);
		ScaleTransition s3 = new ScaleTransition();
		s3.setDuration(Duration.millis(2000));
		s3.setNode(b);
		s3.setByX(1.5);
		s3.setByY(1.5);
		s3.setByZ(1.5);
		s3.setCycleCount(2);
		s3.setAutoReverse(true);
		ScaleTransition s4 = new ScaleTransition();
		s4.setDuration(Duration.millis(2000));
		s4.setNode(hex);
		s4.setByX(1.5);
		s4.setByY(1.5);
		s4.setCycleCount(2);
		s4.setAutoReverse(true);
		
		FadeTransition f4 = new FadeTransition(Duration.millis(2000), hex);
		f4.setFromValue(1.0);
		f4.setToValue(0.3);
		f4.setCycleCount(2);
		f4.setAutoReverse(true);
		
		sphRotate.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				r1.play();
			}
		});
		
		cylRotate.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				
				r2.play();
			}
		});
		
		boxRotate.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				
				r3.play();
			}
		});
		
		hexRotate.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
			
				r4.play();
			}
		});
		
		sphScale.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				
				s1.play();
			}
		});
		
		cylScale.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				
				s2.play();
			}
		});
		
		boxScale.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				
				s3.play();
			}
		});
		
		hexScale.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				
				s4.play();
			}
		});
		
		
		hexFade.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
			
				f4.play();
			}
		});
		
		sphSequential.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				SequentialTransition seq = new SequentialTransition(s, r1, s1);
				seq.play();
			}
		});
		
		cylSequential.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				SequentialTransition seq = new SequentialTransition(c, r2, s2);
				seq.play();
			}
		});
		
		boxSequential.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				SequentialTransition seq = new SequentialTransition(b, r3, s3);
				seq.play();
			}
		});
		
		hexSequential.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				SequentialTransition seq = new SequentialTransition(hex, r4, s4, f4);
				seq.play();
			}
		});
		
		
		
		
		root.getChildren().addAll(menuBar, tile);
		Scene scene = new Scene(root);
		stage.setScene(scene);
		
		stage.setX(800);
		stage.setY(600);
		stage.setMinHeight(400);
		stage.setMinWidth(350);
		stage.setTitle("Animation");
		stage.show();
		
	}
	

}
