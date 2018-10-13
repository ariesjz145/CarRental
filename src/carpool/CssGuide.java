package carpool;

import javafx.scene.Parent;

public class CssGuide {

  public void getCss(Parent parent) {

    parent.getStylesheets().add(getClass().getResource("styleSheet.css")
        .toExternalForm());

  }

}
