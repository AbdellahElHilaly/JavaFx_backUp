package layouts.models;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class About {

  public void load(Stage stage) {
    Parent root;
    try {
      root = FXMLLoader.load(getClass().getResource("../view/about.fxml"));
      Scene scene = new Scene(root);
      stage.setScene(scene);
      stage.show();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}

