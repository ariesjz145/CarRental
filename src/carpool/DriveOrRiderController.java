package carpool;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DriveOrRiderController extends CssGuide {

  public void driverButtonPushed(ActionEvent actionEvent) throws IOException {

    Stage stage = Main.getPrimaryStage();

    Parent driverParent = FXMLLoader.load(getClass().getResource("MainMenuDriver.fxml"));

    stage.setScene(new Scene(driverParent,1080,400));

    //calls css style
    getCss(driverParent);
    stage.show();
  }
}
