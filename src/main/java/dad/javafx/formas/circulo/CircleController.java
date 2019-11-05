package dad.javafx.formas.circulo;


import javafx.util.converter.NumberStringConverter;

public class CircleController {

	private CircleModel model;
	private CircleView view;
	
	public CircleController() {
		
		model = new CircleModel();
		view = new CircleView();
		
		view.getRadiusText().textProperty().bindBidirectional(model.radiusProperty(), new NumberStringConverter());
		view.getAreaText().textProperty().bind(model.areaProperty().asString());
		view.getPerimeterText().textProperty().bind(model.perimeterProperty().asString());
	}
	
	public CircleView getRoot() {
		return view;

	}
}
