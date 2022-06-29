import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application
{

    public void start(Stage primaryStage) throws Exception
    {
        FlowPane root = new FlowPane();
        Guihandler gui = new Guihandler(root);
        primaryStage.setTitle("test");
        primaryStage.setScene(new Scene(root, 150, 200));
        primaryStage.show();
    }


    public static void main(String[] args)
    {
        launch(args);
    }
}