package Chat;



import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Chattik extends Application {

    @Override
    public void start(Stage primaryStage)throws Exception {
        Label label = new Label("Hallo JavaFX!");
        Button bt = new Button("Ja");
        Button ex = new Button("Exit");
        ex.setOnAction (e -> {
        	System.out.println("Bye-bye!");
        	System.exit(0);
        	
        });
        bt.setOnAction(new EventHandler<ActionEvent>() {
        	
        	public void  handle (ActionEvent event) {
        		System.out.println("Hello!");
        	}
        });
        VBox root = new VBox();
        root.getChildren().addAll(bt,ex);
        
        Scene scene = new Scene(root, 300, 200);

        primaryStage.setTitle("Mein erstes JavaFX-Fenster");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
