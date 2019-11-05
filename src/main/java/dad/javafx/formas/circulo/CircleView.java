package dad.javafx.formas.circulo;

import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class CircleView extends GridPane {

	private TextField radiusText;
	private Label areaText,perimeterText;
	private Label radiusLabel;
	private Label areaLabel,perimeterLabel;
	private Circle circle;
	
	public CircleView() {
		super();
		
		radiusLabel = new Label("Radio: ");
		
		radiusText = new TextField();
		radiusText.setPromptText("Radio del circulo");
		radiusText.setPrefColumnCount(5);
		
		areaLabel = new Label("Area: ");
		
		perimeterLabel = new Label("Per¨ªmetro: ");
		
		areaText = new Label();
		perimeterText = new Label();
		
		circle = new Circle();
		circle.setRadius(40);
		circle.setFill(Color.RED);
		circle.setStrokeWidth(2);
		circle.setStroke(Color.BLACK);
		
		addRow(0, radiusLabel, radiusText);
		addRow(1, circle);
		
		setColumnSpan(circle, 2);
		setHalignment(circle, HPos.CENTER);
		
		addRow(2, areaLabel, areaText);
		addRow(3, perimeterLabel, perimeterText);
		
		setAlignment(Pos.CENTER);
		setHgap(15);
		setVgap(5);
	}

	public TextField getRadiusText() {
		return radiusText;
	}

	public Label getAreaText() {
		return areaText;
	}

	public Label getPerimeterText() {
		return perimeterText;
	}

	public Circle getCircle() {
		return circle;
	}
		
	
		
	}
	

