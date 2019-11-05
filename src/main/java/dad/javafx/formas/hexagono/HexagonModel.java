package dad.javafx.formas.hexagono;

import dad.javafx.geometria.MathBinding;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ReadOnlyDoubleWrapper;
import javafx.beans.property.SimpleDoubleProperty;

public class HexagonModel {
	private DoubleProperty radio = new SimpleDoubleProperty();
	private DoubleProperty apotema = new SimpleDoubleProperty();
	private ReadOnlyDoubleWrapper area = new ReadOnlyDoubleWrapper();
	private ReadOnlyDoubleWrapper perimeter = new ReadOnlyDoubleWrapper();
	
	
	public HexagonModel() {
		apotema.bind(MathBinding.sqrt(radio.multiply(radio).subtract(radio.divide(2).multiply(radio.divide(2)))));
		area.bind(perimeter.multiply(apotema).divide(2));
		perimeter.bind(radio.multiply(6));
	}


	public final DoubleProperty radioProperty() {
		return this.radio;
	}
	


	public final double getRadio() {
		return this.radioProperty().get();
	}
	


	public final void setRadio(final double radio) {
		this.radioProperty().set(radio);
	}
	


	public final DoubleProperty apotemaProperty() {
		return this.apotema;
	}
	


	public final double getApotema() {
		return this.apotemaProperty().get();
	}
	


	public final void setApotema(final double apotema) {
		this.apotemaProperty().set(apotema);
	}
	


	public final javafx.beans.property.ReadOnlyDoubleProperty areaProperty() {
		return this.area.getReadOnlyProperty();
	}
	


	public final double getArea() {
		return this.areaProperty().get();
	}
	


	public final javafx.beans.property.ReadOnlyDoubleProperty perimeterProperty() {
		return this.perimeter.getReadOnlyProperty();
	}
	


	public final double getPerimeter() {
		return this.perimeterProperty().get();
	}
	
	
	
}
