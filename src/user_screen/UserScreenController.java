package user_screen;

import add_user.AddUser;
import delete_user.DeleteUser;
import home.HomeScreen;
import search_user.SearchUser;
import update_user.UpdateUser;

public class UserScreenController {
	public void adduserclickbutton() {
		new AddUser().show();
	}

	public void updateUserClicked() {
		new UpdateUser().show();

	}

	public void searchUserClicked() {
		new SearchUser().show();

	}

	public void deleteUserClicked() {
		new DeleteUser().show();

	}

	public void exitUserScreen() {
		new HomeScreen().show();

	}

}
