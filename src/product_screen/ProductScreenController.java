package product_screen;

import add_product.AddProduct;
import delete_product.DeleteProduct;
import home.HomeScreen;
import search_product.SearchProduct;
import update_product.UpdateProduct;

public class ProductScreenController {
	public void addproductClicked() {
		new AddProduct().show();
	}

	public void updateProductClick() {
		new UpdateProduct().show();

	}

	public void searchProductClick() {
		new SearchProduct().show();

	}

	public void deleteProductClick() {
		new DeleteProduct().show();

	}

	public void exitProductScreen() {
		new HomeScreen().show();

	}

}