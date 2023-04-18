package eren.addittionapp;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField numberOne;
    @FXML
    private TextField numberTwo;
    @FXML
    private Label sumLabel;
    @FXML
    private Button calcButton;

   
    @FXML
    private void calculateButtonClicked(ActionEvent event) {
        int sum;
        sum = Integer.parseInt(numberOne.getText()) + Integer.parseInt(numberTwo.getText());
        sumLabel.setText("Your sum is "+sum);
    }
}
