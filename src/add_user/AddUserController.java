package add_user;

import java.sql.SQLException;

import common.Dbutils;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import user_screen.UserScreen;

public class AddUserController {
	@FXML
	TextField fname;

	@FXML
	TextField lname;

	@FXML
	TextField gender;

	@FXML
	TextField age;

	@FXML
	TextField email;

	@FXML
	TextField password;

	@FXML
	TextField rePassword;

	@FXML
	Label errorMessage;

	public void submitUserClicked() throws SQLException {
		String fnames = fname.getText();
		String lnames = lname.getText();
		String genders = gender.getText();
		String ages = age.getText();
		String emails = email.getText();
		String passwords = password.getText();
		String repasswords = rePassword.getText();
		if (passwords.equals(repasswords)) {

			String query = "insert into user(first_name, last_name, gender, age, email, password) values('" + fnames
					+ "','" + lnames + "','" + genders + "','" + ages + "','" + emails + "','" + passwords + "')";
			Dbutils.executeQuery(query);
			errorMessage.setText("User Added Successfully");
		} else {
			errorMessage.setText("User Additon Failed");

		}
	}

	public void backButtons() {
		new UserScreen().show();
	}

}