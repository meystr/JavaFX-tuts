package tutorial2;

import javafx.animation.Animation;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Windows extends Application {


    private static final Image IMAGE = new Image("tutorial2/Astyanax.gif");

    private static final int COLUMNS  =   3;
    private static final int COUNT    =  3;
    private static final int OFFSET_X =  87;
    private static final int OFFSET_Y =  3;
    private static final int WIDTH    = 63;
    private static final int HEIGHT   = 88;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        primaryStage.setTitle("App");

        final ImageView imageView = new ImageView(IMAGE);
        imageView.setViewport(new Rectangle2D(OFFSET_X, OFFSET_Y, WIDTH, HEIGHT));

        final Animation animation = new SpriteAnimation(
                imageView,
                Duration.millis(1000),
                COUNT, COLUMNS,
                OFFSET_X, OFFSET_Y,
                WIDTH, HEIGHT
        );
        animation.setCycleCount(Animation.INDEFINITE);
        animation.play();
        Group root = new Group();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        scene.setFill(Color.GREEN);
        root.getChildren().add(imageView);
        imageView.setX(15);
        imageView.setY(400);
        primaryStage.setMinWidth(800);
        primaryStage.setMinHeight(600);

        primaryStage.show();
    }
}