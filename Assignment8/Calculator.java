package homework8;

import java.util.HashMap;
import java.util.Map;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Calculator extends Application{
	
	private String displayText = "";
	private Map<String, Button> btn = new HashMap<String, Button>();
	private Integer[] nums= {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	private String[] ops = {".", "AC", "+", "-", "*", "/", "="};
	
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {		
		
		VBox root = new VBox();
		root.setAlignment(Pos.CENTER);
		
		HBox display = new HBox();
		display.setAlignment(Pos.CENTER);
		display.setPadding(new Insets(10, 10, 10, 10));
		
		VBox operands = new VBox();
		operands.setSpacing(10);
		operands.setAlignment(Pos.CENTER_RIGHT);
				
		GridPane grid = new GridPane();
		grid.setVgap(10);
		grid.setHgap(10);
		
		TextField d = new TextField("enter number");
		d.setEditable(false);
		d.setMinSize(210, 20);
		display.getChildren().add(d);
		
		for(Integer i : nums) {
			String label = i.toString();
			btn.put(label, new Button(label));
			btn.get(label).setMinSize(40, 40);
		}
		
		for(String i : ops) {
			String label = i;
			btn.put(label, new Button(label));
			btn.get(label).setMinSize(40, 30);
			operands.getChildren().add(btn.get(label));
		}
		
		btn.get(".").setMinSize(40, 40);
		btn.get("AC").setMinSize(40, 40);
		
		grid.addRow(0, btn.get("1"), btn.get("2"), btn.get("3"));
		grid.addRow(1, btn.get("4"), btn.get("5"), btn.get("6"));
		grid.addRow(2, btn.get("7"), btn.get("8"), btn.get("9"));
		grid.addRow(3, btn.get("."), btn.get("0"), btn.get("AC"));
		
		grid.setMinSize(160, 190);
		grid.setAlignment(Pos.CENTER);
		
		HBox buttons = new HBox();
		buttons.getChildren().addAll(grid, operands);
		buttons.setAlignment(Pos.CENTER);
		
		root.getChildren().addAll(display, buttons);
		
		Scene scene = new Scene(root);
		stage.setScene(scene);
		
		stage.setX(800);
		stage.setY(600);
		stage.setMinHeight(400);
		stage.setMinWidth(350);
		stage.setTitle("Calculator");
		stage.show();
		
		//Centers the window on the screen
		Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
        stage.setX((primScreenBounds.getWidth() - stage.getWidth()) / 2);
        stage.setY((primScreenBounds.getHeight() - stage.getHeight()) / 2);
        
        //Event handler
        EventHandler<MouseEvent> processTextEventHandler = new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				Button source = (Button) event.getSource();
				if(btn.get("AC") == source) {
					displayText = "";
				}
				else if(btn.get("=") == source) {
					ScriptEngineManager mgr = new ScriptEngineManager();
				    ScriptEngine engine = mgr.getEngineByName("JavaScript");
				    String operation = displayText;
				    try {
						displayText = engine.eval(operation).toString();
					} catch (ScriptException e) {
						e.printStackTrace();
					}
				}
				else if(btn.containsValue(source)) {
					displayText += source.getText();
				}			
				d.setText(displayText);
			}
        };
        
        for(String i : btn.keySet()) {
        	btn.get(i).addEventHandler(MouseEvent.MOUSE_CLICKED, processTextEventHandler);
        }
	}
}
