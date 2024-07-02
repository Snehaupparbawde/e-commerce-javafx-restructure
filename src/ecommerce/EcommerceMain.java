package ecommerce;

import common.StageHolder;
import javafx.application.Application;
import javafx.stage.Stage;
import login.LoginScreen;

public class EcommerceMain extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stageOfJavaFx) throws Exception {
		StageHolder.stage = stageOfJavaFx;
		StageHolder.stage.setTitle("E-Commerce");
		new LoginScreen().show();
	}
}