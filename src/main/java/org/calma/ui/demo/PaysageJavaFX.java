package org.calma.ui.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class PaysageJavaFX extends Application {

    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();

        // Ciel
        Rectangle ciel = new Rectangle(800, 600);
        ciel.setFill(Color.SKYBLUE);

        // Sol
        Rectangle sol = new Rectangle(800, 100);
        sol.setFill(Color.GREEN);
        sol.setTranslateY(250);

        // Montagnes
        Polygon montagne1 = new Polygon();
        montagne1.getPoints().addAll(200.0, 250.0, 400.0, 100.0, 600.0, 250.0);
        montagne1.setFill(Color.GRAY);

        Polygon montagne2 = new Polygon();
        montagne2.getPoints().addAll(100.0, 250.0, 350.0, 150.0, 600.0, 250.0);
        montagne2.setFill(Color.DARKGRAY);

        // Soleil
        Circle soleil = new Circle(50, Color.YELLOW);
        soleil.setTranslateX(300);
        soleil.setTranslateY(-150);

        // Dromadaire (corps)
        Ellipse corps = new Ellipse(70, 40);
        corps.setFill(Color.BROWN);
        corps.setTranslateY(170);
        corps.setTranslateX(-100);

        // Dromadaire (tête)
        Circle tete = new Circle(20);
        tete.setFill(Color.BROWN);
        tete.setTranslateY(140);
        tete.setTranslateX(-120);

        // Dromadaire (jambes)
        Rectangle jambe1 = new Rectangle(10, 50);
        jambe1.setFill(Color.BROWN);
        jambe1.setTranslateX(-80);
        jambe1.setTranslateY(220);

        Rectangle jambe2 = new Rectangle(10, 50);
        jambe2.setFill(Color.BROWN);
        jambe2.setTranslateX(-50);
        jambe2.setTranslateY(220);

        Rectangle jambe3 = new Rectangle(10, 50);
        jambe3.setFill(Color.BROWN);
        jambe3.setTranslateX(-120);
        jambe3.setTranslateY(220);

        Rectangle jambe4 = new Rectangle(10, 50);
        jambe4.setFill(Color.BROWN);
        jambe4.setTranslateX(-90);
        jambe4.setTranslateY(220);

        // Dromadaire (bosse)
        Ellipse bosse = new Ellipse(30, 15);
        bosse.setFill(Color.SADDLEBROWN);
        bosse.setTranslateY(130);
        bosse.setTranslateX(-70);

        // Dromadaire (colonne vertébrale)
        Rectangle colonneVertebrale = new Rectangle(10, 40);
        colonneVertebrale.setFill(Color.BROWN);
        colonneVertebrale.setTranslateX(-100);
        colonneVertebrale.setTranslateY(130);

        // Enfant (tête)
        Circle enfantTete = new Circle(15);
        enfantTete.setFill(Color.BEIGE);
        enfantTete.setTranslateX(200);
        enfantTete.setTranslateY(200);

        // Enfant (corps)
        Rectangle enfantCorps = new Rectangle(20, 40);
        enfantCorps.setFill(Color.BLUE);
        enfantCorps.setTranslateX(200);
        enfantCorps.setTranslateY(240);

        // Enfant (bras)
        Line brasGauche = new Line(190, 240, 170, 220);
        brasGauche.setStroke(Color.BLACK);
        brasGauche.setStrokeWidth(3);

        Line brasDroit = new Line(210, 240, 230, 220);
        brasDroit.setStroke(Color.BLACK);
        brasDroit.setStrokeWidth(3);

        // Enfant (jambes)
        Line jambeGauche = new Line(195, 260, 190, 290);
        jambeGauche.setStroke(Color.BLACK);
        jambeGauche.setStrokeWidth(3);

        Line jambeDroite = new Line(205, 260, 210, 290);
        jambeDroite.setStroke(Color.BLACK);
        jambeDroite.setStrokeWidth(3);

        // Ajouter tous les éléments à la scène
        root.getChildren().addAll(
                ciel, sol, montagne1, montagne2, soleil,
                corps, tete, jambe1, jambe2, jambe3, jambe4, bosse, colonneVertebrale,
                enfantTete, enfantCorps, brasGauche, brasDroit, jambeGauche, jambeDroite
        );

        Scene scene = new Scene(root, 800, 600);

        primaryStage.setTitle("Paysage JavaFX avec Dromadaire et Enfant");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
