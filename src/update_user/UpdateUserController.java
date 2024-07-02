package update_user;

import java.sql.ResultSet;
import java.sql.SQLException;

import common.Dbutils;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import user_screen.UserScreen;

public class UpdateUserController {
	@FXML
	TextField updateName;

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

	@FXML
	Label errorMessage1;

	public void submitUserClicked() throws SQLException {
		String updatedUser = updateName.getText();
		String selectQuery = "select * from user where first_name='" + updatedUser + "'";
		ResultSet resultset = Dbutils.executeSelectQuery(selectQuery);
		if (resultset.next()) {
			errorMessage.setText("Enter Updated User Details Below:");
		} else {
			errorMessage.setText("User Not Found!!");
		}
	}

	public void updateUserClicked() throws SQLException {
		String updatedUser = updateName.getText();
		String fnames = fname.getText();
		String lnames = lname.getText();
		String genders = gender.getText();
		String ages = age.getText();
		String emails = email.getText();
		String passwords = password.getText();
		String repasswords = rePassword.getText();
		if (passwords.equals(repasswords)) {

			String updateQuery = "update user set first_name='" + fnames + "', last_name='" + lnames + "' ,gender='"
					+ genders + "' ,age='" + ages + "' ,email='" + emails + "' , password='" + passwords
					+ "' where first_name='" + updatedUser + "'";
			Dbutils.executeQuery(updateQuery);
			errorMessage1.setText("User Update Successfully!!");
		} else {
			errorMessage1.setText("User Addition Failed!!");
		}
	}

	public void backButton() {
		new UserScreen().show();
	}

}