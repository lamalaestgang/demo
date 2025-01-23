package org.calma.ui.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        Canvas canvas = new Canvas(800, 600);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // Dessiner un ciel
        gc.setFill(Color.SKYBLUE);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());

        // Dessiner de l'herbe
        gc.setFill(Color.GREEN);
        gc.fillRect(0, 400, canvas.getWidth(), 200);

        // Dessiner un soleil
        gc.setFill(Color.YELLOW);
        gc.fillOval(600, 50, 100, 100);

        // Dessiner un dromadaire
        gc.setFill(Color.BROWN);
        gc.fillRect(200, 300, 150, 100); // Corps
        gc.fillRect(230, 250, 50, 50);   // Bosse
        gc.fillRect(300, 250, 50, 50);   // Deuxième bosse
        gc.fillRect(180, 350, 20, 50);   // Jambe gauche
        gc.fillRect(350, 350, 20, 50);   // Jambe droite

        // Configurer la scène
        Scene scene = new Scene(new javafx.scene.layout.StackPane(canvas));
        stage.setTitle("Paysage généré par une IA avec un dromadaire !");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
