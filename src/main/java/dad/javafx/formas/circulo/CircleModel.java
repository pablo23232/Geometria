package dad.javafx.formas.circulo;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ReadOnlyDoubleWrapper;
import javafx.beans.property.SimpleDoubleProperty;

public class CircleModel {

	private DoubleProperty radius = new SimpleDoubleProperty();
	private ReadOnlyDoubleWrapper area = new ReadOnlyDoubleWrapper();
	private ReadOnlyDoubleWrapper perimeter = new ReadOnlyDoubleWrapper();

	public CircleModel() {
		
		area.bind(radius.multiply(Math.PI).multiply(radiusProperty()));
		perimeter.bind(radius.multiply(Math.PI*2));
	}

	public final DoubleProperty radiusProperty() {
		return this.radius;
	}
	

	public final double getRadius() {
		return this.radiusProperty().get();
	}
	

	public final void setRadius(final double radius) {
		this.radiusProperty().set(radius);
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
