package home;

import login.LoginScreen;
import product_screen.ProductScreen;
import user_screen.UserScreen;

public class HomeScreenController {
	public void addUserButtonClicked() {
		new UserScreen().show();

	}

	public void addProductClicked() {
		new ProductScreen().show();
	}

	public void exitHomeScreenClicked() {
		new LoginScreen().show();
	}

}