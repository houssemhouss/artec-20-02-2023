package pi.GUI;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class signInFXMLController implements Initializable {

    @FXML
    private Label label;

    @FXML
    private TextField txtusername;

    @FXML
    private Button loginBtn;

    @FXML
    private PasswordField txtpass;

    @FXML
    private Button signupBtn;

    @FXML
    private Label errorLabel;

    @FXML
    private Label errorMsg;

    @FXML
    private Button forgotBtn;

    @FXML
    private Button exitBtn;

    @FXML
    void login(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
       
    }

}
