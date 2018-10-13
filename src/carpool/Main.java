package carpool;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

  private static Stage primaryStage;

  @Override
  public void start(Stage primaryStage) throws Exception{

    setPrimaryStage(primaryStage);

    Parent root = FXMLLoader.load(getClass().getResource("LoginMain.fxml"));

    primaryStage.setTitle("Super Awesome Car Pool GUI Made By Five Good Looking Dudes");
    primaryStage.setScene(new Scene(root, 1080, 400));
    root.getStylesheets().add(getClass().getResource("styleSheet.css")
        .toExternalForm());

    primaryStage.show();
  }
  private void setPrimaryStage(Stage stage) {

    Main.primaryStage = stage;
  }

  static public Stage getPrimaryStage() {

    return primaryStage;
  }

  public static void main(String[] args) {

    launch(args);
  }
}
