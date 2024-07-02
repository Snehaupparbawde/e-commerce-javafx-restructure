package delete_user;

import java.sql.SQLException;

import common.Dbutils;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import user_screen.UserScreen;

public class DeleteUserController {

	@FXML
	TextField deleteName;

	@FXML
	Label deleteErrorMessage;

	public void deleteButtonClicked() throws SQLException {
		String deleteNames = deleteName.getText();
		String deleteQuery = "delete from user where first_name='" + deleteNames + "'";
		Dbutils.executeQuery(deleteQuery);
		deleteErrorMessage.setText("User Deleted Successfully!!");
	}

	public void backButton() {
		new UserScreen().show();
	}

}
