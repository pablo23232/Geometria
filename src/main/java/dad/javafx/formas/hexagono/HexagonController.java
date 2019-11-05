package dad.javafx.formas.hexagono;

import javafx.util.converter.NumberStringConverter;

public class HexagonController {

	private HexagonModel model;
	private HexagonView view;
	
	public HexagonController() {
		
		model = new HexagonModel();
		view = new HexagonView();
		
		
		view.getRadiusTxt().textProperty().bindBidirectional(model.radioProperty(), new NumberStringConverter());
		
		view.getAreaTxt().textProperty().bind(model.areaProperty().asString());
		view.getPerimeterTxt().textProperty().bind(model.perimeterProperty().asString());
	}
	
	public HexagonView getRoot() {
		return view;
	}
}