package dad.javafx.geometria;

import dad.javafx.formas.circulo.CircleController;
import dad.javafx.formas.hexagono.HexagonController;
import dad.javafx.formas.rectangulo.RectangleController;
import dad.javafx.formas.Triangulo.TriangleController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.stage.Stage;

public class GeometriaApp extends Application {
	
	private RectangleController rectangleController;
	private CircleController circleController;
	private TriangleController triangleController;
	private HexagonController hexagonController;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		rectangleController = new RectangleController();
		circleController = new CircleController();
		triangleController = new TriangleController();
		hexagonController = new HexagonController();
		
		TabPane root = new TabPane();
		root.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE); 
		
		Tab tab1 = new Tab("Rect¨¢ngulo");
		tab1.setContent(rectangleController.getRoot());
		
		Tab tab2 = new Tab("C¨ªrculo");
		tab2.setContent(circleController.getRoot());
		
		Tab tab3 = new Tab("Tri¨¢ngulo");
		tab3.setContent(triangleController.getRoot());
		
		Tab tab4 = new Tab("Hex¨¢gono");
		tab4.setContent(hexagonController.getRoot());
		
		root.getTabs().addAll(tab1, tab2, tab3, tab4);
		
		Scene scene = new Scene(root, 512, 256);
		primaryStage.setTitle("Geometr¨ªa");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);

	}

}