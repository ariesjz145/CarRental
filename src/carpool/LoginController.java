package carpool;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class LoginController extends CssGuide{

  /**
   * When this method is called it will switch the scene to DriverOrRider
   */
  public void logInButtonPushed() throws IOException {

    Stage stage = Main.getPrimaryStage();

    Parent driverOrRiderParent = FXMLLoader.load(getClass().getResource("DriveOrRider.fxml"));
    stage.setScene(new Scene(driverOrRiderParent, 1080, 400));

    //calls css style
    getCss(driverOrRiderParent);
    stage.show();
  }

  /**
   * When this method is called it will switch the scene to NewUser
   */
  public void changeScreenButtonPushed(javafx.event.ActionEvent actionEvent) throws IOException {

    Stage stage = Main.getPrimaryStage();

    Parent newUserParent = FXMLLoader.load(getClass().getResource("NewUser.fxml"));
    stage.setScene(new Scene(newUserParent, 1080,400));


    // calls css style
    getCss(newUserParent);
    stage.show();
  }
}
