package login;

import java.sql.ResultSet;

import common.Dbutils;
import home.HomeScreen;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class LoginScreenController {
	@FXML
	TextField username;

	@FXML
	TextField password;

	@FXML
	Label errorMessage;

	public void loginButtonClicked() throws Exception {

		String userName = username.getText();
		String Password = password.getText();

		String selectQuery = "select * from login where login_name= '" + userName + "' && password='" + Password + "' ";
		ResultSet resultset = Dbutils.executeSelectQuery(selectQuery);
		if (resultset.next()) {
			errorMessage.setText("Login Success!!");
			errorMessage.setTextFill(Color.GREEN);
			new HomeScreen().show();
		} else {
			errorMessage.setText("Login Failed!!");
			errorMessage.setTextFill(Color.RED);
		}

	}

}