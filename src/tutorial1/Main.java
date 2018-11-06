package tutorial1;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        final long startNanoTime = System.nanoTime();
        primaryStage.setTitle("Wirująca Ziemia");

        Group root = new Group();
        Scene scena = new Scene(root);
        primaryStage.setScene(scena);
        primaryStage.setMinHeight(600);
        primaryStage.setMinWidth(900);
        primaryStage.setResizable(false);
        Canvas canvas = new Canvas(900, 600);
        root.getChildren().add(canvas);
        final GraphicsContext gc = canvas.getGraphicsContext2D();
        final Image image = new Image("tutorial1\\Earth.jpg", 200, 200, true, false);
        primaryStage.show();

        new AnimationTimer() {
            public void handle(long currentNanoTime) {
                double t = (currentNanoTime - startNanoTime) / 1000000000.00;
                double x = 250 + 128 * Math.cos(t);
                double y = 250 + 128 * Math.sin(t);
                gc.clearRect(0,0,800,900);
                gc.drawImage(image, x, y);
            }
        }.start();
    }
}