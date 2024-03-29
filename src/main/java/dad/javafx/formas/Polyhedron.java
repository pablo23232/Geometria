package dad.javafx.formas;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.shape.Polygon;

public class Polyhedron extends Polygon {


	private IntegerProperty sides = new SimpleIntegerProperty();
	private DoubleProperty radius = new SimpleDoubleProperty();
	
	public Polyhedron(double radius, int sides) {
		super();
		this.radius.set(radius);
		this.sides.set(sides);
		
		createPoints(); 
		
		this.radius.addListener((o, lv, nv) -> createPoints());
		this.sides.addListener((o, lv, nv) -> createPoints() );
	}

	public Polyhedron() {
		this(0.0, 0);
	}
	
	private void createPoints() {
		double radius = getRadius();
		double sid = getSides();
		
		getPoints().clear();
		
		for( int i = 0; i < sid; i++ ) {
			double x = radius + radius * Math.cos(i * 2 * Math.PI / sid);
			double y = radius + radius * Math.sin(i * 2 * Math.PI / sid);
			getPoints().addAll(x,y);
		}
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

	public final IntegerProperty sidesProperty() {
		return this.sides;
	}
	

	public final int getSides() {
		return this.sidesProperty().get();
	}
	

	public final void setSides(final int sides) {
		this.sidesProperty().set(sides);
	}
	
	
}