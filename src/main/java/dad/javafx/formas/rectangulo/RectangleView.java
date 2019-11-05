package dad.javafx.formas.rectangulo;

import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class RectangleView extends GridPane {

	private TextField widthText, heightText;
	private Label areaText, perimeterText;
	private Label widthLabel, heightLabel;
	private Label areaLabel, perimeterLabel;
	private Rectangle rectangle;
	
	public RectangleView() {
		super();
		
		widthLabel = new Label("Ancho:");
		heightLabel = new Label("Alto:");
		
		widthText = new TextField();
		widthText.setPromptText("Ancho");
		widthText.setPrefColumnCount(5);
		heightText = new TextField();
		heightText.setPromptText("Alto");
		heightText.setPrefColumnCount(5);
		
		rectangle = new Rectangle();
		rectangle.setWidth(80);
		rectangle.setHeight(60);
		rectangle.setFill(Color.rgb(0, 162, 232));
		rectangle.setStrokeWidth(2);
		rectangle.setStroke(Color.BLACK);
		
		areaLabel = new Label("Area:");
		perimeterLabel = new Label("Per¨ªmetro:");
		
		areaText = new Label();
		perimeterText = new Label();

		addRow(0, widthLabel, widthText);
		addRow(1, heightLabel, heightText);
		addRow(2, rectangle);
		
		setColumnSpan(rectangle, 2);
		setHalignment(rectangle, HPos.CENTER);
		
		addRow(3, areaLabel, areaText);
		addRow(4, perimeterLabel, perimeterText);
		
		setAlignment(Pos.CENTER);
		setHgap(15);
		setVgap(5);
	}

	public TextField getWidthText() {
		return widthText;
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

	public Rectangle getRectangle() {
		return rectangle;
	}
	
}