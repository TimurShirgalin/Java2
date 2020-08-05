package Lesson4;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class Controller {
    @FXML
    TextField message;

    @FXML
    TextArea textArea;

    @FXML
    public void action() {
        textArea.appendText("Вы:\n" + message.getText() + "\n\n");
        message.clear();
        message.requestFocus();
    }
}
