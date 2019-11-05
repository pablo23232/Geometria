package dad.javafx.formas.hexagono;

import dad.javafx.formas.Polyhedron;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class HexagonView extends GridPane {

	private TextField radiusText;
	private Label areaText, perimeterText;
	private Label radiusLabel;
	private Label areaLabel, perimeterLabel;
	private Polyhedron hexagon;
	
	public HexagonView() {
		super();
		radiusLabel = new Label("Radio:");
		
		radiusText = new TextField();
		radiusText.setPromptText("Radio");
		radiusText.setPrefColumnCount(5);
		
		hexagon = new Polyhedron(40, 6);
		hexagon.setFill(Color.MAGENTA);
		hexagon.setStrokeWidth(2);
		hexagon.setStroke(Color.BLACK);
		
		areaLabel = new Label("Area:");
		perimeterLabel = new Label("Per¨ªmetro:");
		
		areaText = new Label();
		perimeterText = new Label();
		
		addRow(0, radiusLabel, radiusText);
		addRow(1, hexagon);
		
		setColumnSpan(hexagon, 2);
		setHalignment(hexagon, HPos.CENTER);
		
		addRow(2, areaLabel, areaText);
		addRow(3, perimeterLabel, perimeterText);
		
		setAlignment(Pos.CENTER);
		setHgap(15);
		setVgap(5);
	}

	public TextField getRadiusTxt() {
		return radiusText;
	}

	public Label getAreaTxt() {
		return areaText;
	}

	public Label getPerimeterTxt() {
		return perimeterText;
	}

	public Polyhedron getHexagonShape() {
		return hexagon;
	}
}
