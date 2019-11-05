package dad.javafx.formas.rectangulo;

import javafx.util.converter.NumberStringConverter;

public class RectangleController {
	
	private RectangleModel model;
	private RectangleView view;
	
	public RectangleController() {
		
		model = new RectangleModel();
		view = new RectangleView();
		
		// Usamos bind bidireccionales para transformar el texto en un n¨²mero que el modelo pueda interpretar
		view.getWidthText().textProperty().bindBidirectional(model.widthProperty(), new NumberStringConverter());
		view.getHeightText().textProperty().bindBidirectional(model.heightProperty(), new NumberStringConverter());
		
		view.getAreaText().textProperty().bind(model.areaProperty().asString());
		view.getPerimeterText().textProperty().bind(model.perimeterProperty().asString());
	}
	
	public RectangleView getRoot() {
		return view;
	}
}
