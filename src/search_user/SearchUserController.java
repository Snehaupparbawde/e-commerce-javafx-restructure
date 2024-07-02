
package search_user;

import java.sql.ResultSet;
import java.sql.SQLException;

import common.Dbutils;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import user_screen.UserScreen;

public class SearchUserController {
	@FXML
	TextField searchName;

	@FXML
	Label displayText;

	@FXML
	Label errorMessage1;

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

	public void searchUserClicked() throws SQLException {
		String fnames = searchName.getText();
		String searchQuery = "select * from user where first_name='" + fnames + "'";
		ResultSet resultSet = Dbutils.executeSelectQuery(searchQuery);
		if (resultSet.next()) {
			fname.setText(resultSet.getString(1));
			lname.setText(resultSet.getString(2));
			gender.setText(resultSet.getString(3));
			age.setText(resultSet.getString(4));
			email.setText(resultSet.getString(5));
			password.setText(resultSet.getString(6));

		} else {
			errorMessage1.setText("User Not Found!!");
		}
	}

	public void backButton() {
		new UserScreen().show();
	}

}