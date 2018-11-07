package tutorial2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Windows extends Application {
    Canvas canvas = new Canvas(90, 75);
    GraphicsContext gc = canvas.getGraphicsContext2D();
    Image image = new Image("tutorial2/MS3-TypeR.PNG");


    @Override
    public void start(Stage primaryStage) {
        System.out.println("Metoda start :)");
        Group root = new Group();
        Scene scene = new Scene(root,600,500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Próba okien :)");
       // primaryStage.setMaximized(true);
        primaryStage.sizeToScene();
        primaryStage.centerOnScreen();
        primaryStage.show();
        root.getChildren().add(canvas);
        gc.drawImage(image, 20, 10);
    }

    @Override
    public void init() throws Exception {
        super.init();
        System.out.println("Metoda init :)");
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        System.out.println("Metoda stop :)");
    }
}
