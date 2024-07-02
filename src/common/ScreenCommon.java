package common;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class ScreenCommon {

	public void show() {
		String myClassName = getClass().getSimpleName();
		String classFilePath = getClass().getResource(myClassName + ".class").toString();
		String fxmlFilePath = classFilePath.replace(".class", ".fxml");
		String actualPath = fxmlFilePath.substring(8);

		try {
			URL fxmlurl = Paths.get(actualPath).toUri().toURL();
			try {
				Parent actorGroup = FXMLLoader.load(fxmlurl);
				Scene scene = new Scene(actorGroup, 600, 600);
				StageHolder.stage.setScene(scene);
				StageHolder.stage.show();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}