package br.edu.univas.si5.es3.report;

import java.util.List;

public class ProductTotalizer {

	private ProductDAO dao = new ProductDAO();

	public int totalize() {
		List<Product> products = dao.listAll();
		return products.stream().mapToInt(Product::getQuantity).sum();
	}

}
