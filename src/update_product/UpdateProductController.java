package update_product;

import java.sql.ResultSet;
import java.sql.SQLException;

import common.Dbutils;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import product_screen.ProductScreen;

public class UpdateProductController {
	@FXML
	TextField updateName;

	@FXML
	TextField pname;

	@FXML
	TextField pquantity;

	@FXML
	TextField pprice;

	@FXML
	Label errorMessage;

	@FXML
	Label errorMessage1;

	public void submitproductClicked() throws SQLException {
		String updaten = updateName.getText();

		String selectQuery = "select * from product where product_name='" + updaten + "'";
		ResultSet resultset = Dbutils.executeSelectQuery(selectQuery);
		if (resultset.next()) {
			errorMessage.setText("Enter updated Product Detail:");
		} else {
			errorMessage.setText("Product Not Found");
		}

	}

	public void updateproductClick() throws SQLException {
		String updaten = updateName.getText();
		String pnames = pname.getText();
		String pquantities = pquantity.getText();
		String pprices = pprice.getText();
		String updateroduct = "update product set product_name='" + pnames + "',product_quantity='" + pquantities
				+ "',product_price='" + pprices + "' where product_name='" + updaten + "'";
		Dbutils.executeQuery(updateroduct);
		errorMessage1.setText("Product Update Succeesfully!!");
	}

	public void backButtonClick() {
		new ProductScreen().show();
	}

}
