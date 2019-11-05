package dad.javafx.formas.Triangulo;


import javafx.util.converter.NumberStringConverter;

public class TriangleController {

	private TriangleModel model;
	private TriangleView view;
	
	public TriangleController() {
		
		model = new TriangleModel();
		view = new TriangleView();
		
		
		view.getBaseText().textProperty().bindBidirectional(model.baseProperty(), new NumberStringConverter());
		view.getHeightText().textProperty().bindBidirectional(model.heightProperty(), new NumberStringConverter());
		
		view.getAreaText().textProperty().bind(model.areaProperty().asString());
		view.getPerimeterText().textProperty().bind(model.perimeterProperty().asString());
	}
	
	public TriangleView getRoot() {
		return view;
	}
}