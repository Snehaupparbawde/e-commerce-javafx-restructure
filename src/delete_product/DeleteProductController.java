package delete_product;

import java.sql.SQLException;

import common.Dbutils;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import product_screen.ProductScreen;

public class DeleteProductController {
	@FXML
	TextField deleteName;

	@FXML
	Label deleteErrorMessage;

	public void deleteButtonClicked() throws SQLException {
		String deleteNames = deleteName.getText();
		String deleteQuery = "delete from product where product_name='" + deleteNames + "'";
		Dbutils.executeQuery(deleteQuery);
		deleteErrorMessage.setText("Product Deleted Successfully!!");
	}

	public void backButton() {
		new ProductScreen().show();
	}

}
