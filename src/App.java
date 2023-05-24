import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import layouts.models.About;

import java.io.IOException;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("layouts/view/stage.fxml"));
        stage.setTitle("JavaFx BackUp");
        stage.setScene(new Scene(root));
        stage.show();

        About about = new About();
        about.load(stage);
    }

    public static void main(String[] args) {
        launch();
    }
}
