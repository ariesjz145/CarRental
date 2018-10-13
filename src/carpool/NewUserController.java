package carpool;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class NewUserController extends CssGuide{

  /**
   * When this method is called it will switch the scene to LoginMain
   */
  public void goBackToLoginScene(javafx.event.ActionEvent actionEvent) throws IOException {

    Stage stage = Main.getPrimaryStage();

    Parent logInParent = FXMLLoader.load(getClass().getResource("LoginMain.fxml"));

    stage.setScene(new Scene(logInParent,1080,400));

    //calls css style
    getCss(logInParent);
    stage.show();
  }
}
