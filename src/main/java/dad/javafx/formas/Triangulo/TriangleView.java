package dad.javafx.formas.Triangulo;

import dad.javafx.formas.Triangle;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class TriangleView extends GridPane {

	private TextField baseText, heightText;
	private Label areaText, perimeterText;
	private Label baseLabel, heightLabel;
	private Label areaLabel, perimeterLabel;
	private Triangle triangle;
	
	public TriangleView() {
		super();
		
		baseLabel = new Label("Base:");
		heightLabel = new Label("Altura:");
		
		baseText = new TextField();
		baseText.setPromptText("Base");
		baseText.setPrefColumnCount(5);
		heightText = new TextField();
		heightText.setPromptText("Altura");
		heightText.setPrefColumnCount(5);
		
		triangle = new Triangle(80,60);
		triangle.setFill(Color.GREEN);
		triangle.setStrokeWidth(2);
		triangle.setStroke(Color.BLACK);	
		
		areaLabel = new Label("Area:");
		perimeterLabel = new Label("Per¨ªmetro:");
		
		areaText = new Label();
		perimeterText = new Label();

		addRow(0, baseLabel, baseText);
		addRow(1, heightLabel, heightText);
		addRow(2, triangle);
		
		setColumnSpan(triangle, 2);
		setHalignment(triangle, HPos.CENTER);
		
		addRow(3, areaLabel, areaText);
		addRow(4, perimeterLabel, perimeterText);
		
		setAlignment(Pos.CENTER);
		setHgap(15);
		setVgap(5);
	}
	public TextField getBaseText() {
		return baseText;
	}

	public TextField getHeightText() {
		return heightText;
	}

	public Label getAreaText() {
		return areaText;
	}

	public Label getPerimeterText() {
		return perimeterText;
	}

	public Triangle getTriangle() {
		return triangle;
	}

}