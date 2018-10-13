package carpool;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CreateNewUser extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    primaryStage.setTitle("JavaFX Welcome");
    GridPane grid = new GridPane();
    grid.setAlignment(Pos.CENTER);
    grid.setHgap(10);
    grid.setVgap(10);
    grid.setPadding(new Insets(25, 25, 25, 25));

    Text scenetitle = new Text("Welcome");
    //scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
    grid.add(scenetitle, 0, 0, 2, 1);

    Label Name = new Label ("Enter your full name:");
    grid.add(Name, 0, 1);

    TextField nameTextField = new TextField();
    grid.add(nameTextField, 1, 1);

    Label Age = new Label("Enter your age:");
    grid.add(Age, 0, 2);

    TextField ageTextField = new TextField();
    grid.add(ageTextField, 1, 2);

    Label Sex = new Label("Enter your sex:");
    grid.add(Sex, 0, 3);

    TextField sexTextField = new TextField();
    grid.add(sexTextField, 1, 3);

    Label Address = new Label("Enter your address:");
    grid.add(Address, 0, 4);

    TextField addressTextField = new TextField();
    grid.add(addressTextField, 1, 4);

    Label phoneNumber = new Label("Enter your phone number:");
    grid.add(phoneNumber, 0, 5);

    TextField phoneNumberTextField = new TextField();
    grid.add(phoneNumberTextField, 1, 5);

    Label userName = new Label("Enter new user name:");
    grid.add(userName, 0, 6);

    TextField userTextField = new TextField();
    grid.add(userTextField, 1, 6);

    Label pw = new Label("Password:");
    grid.add(pw, 0, 7);

    PasswordField pwBox = new PasswordField();
    grid.add(pwBox, 1, 7);

    Label pww = new Label("Re-enter password:");
    grid.add(pww
        , 0, 8);

    PasswordField pwwBox = new PasswordField();
    grid.add(pwwBox, 1, 8);

    Button btn = new Button("Create new user");
    HBox hbBtn = new HBox(10);
    hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
    hbBtn.getChildren().add(btn);
    grid.add(hbBtn, 1, 9);

    final Text actiontarget = new Text();
    grid.add(actiontarget, 1, 10);

    btn.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent e) {
        //actiontarget.setFill(Color.FIREBRICK);
        actiontarget.setText("You have created a new user! :D");
      }
    });
    Scene scene = new Scene(grid, 700, 575);
    primaryStage.setScene(scene);
    scene.getStylesheets().add
        (CreateNewUser.class.getResource("Login.css").toExternalForm());
    scenetitle.setId("welcome-text");
    actiontarget.setId("actiontarget");
    primaryStage.show();
  }
}