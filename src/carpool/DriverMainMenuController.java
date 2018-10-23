package carpool;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DriverMainMenuController extends CssGuide{
  public void changeToScheduleBtn(javafx.event.ActionEvent actionEvent) throws IOException {

    Stage stage = Main.getPrimaryStage();

    Parent scheduleParent = FXMLLoader.load(getClass().getResource("Schedule.fxml"));
    stage.setScene(new Scene(scheduleParent, 1080,400));



    stage.show();
    getCss(scheduleParent);
  }
  public void changeToRatingScreenBtn(javafx.event.ActionEvent actionEvent) throws IOException {

    Stage stage = Main.getPrimaryStage();

    Parent ratingParent = FXMLLoader.load(getClass().getResource("RatingScreen.fxml"));
    stage.setScene(new Scene(ratingParent, 1080,400));



    stage.show();
    getCss(ratingParent);
  }
  public void changeAccountScreenBtn(javafx.event.ActionEvent actionEvent) throws IOException {

    Stage stage = Main.getPrimaryStage();

    Parent scheduleParent = FXMLLoader.load(getClass().getResource("AccountScreen.fxml"));
    stage.setScene(new Scene(scheduleParent, 1080,400));



    stage.show();
    getCss(scheduleParent);
  }

}
