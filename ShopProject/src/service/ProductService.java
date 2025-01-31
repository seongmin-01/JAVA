package service;

import java.util.List;

import dao.ProductDAO;
import entity.Product;

public class ProductService {
	
	private static final ProductService instance = new ProductService();
	public static ProductService getInstance() {
		return instance;
	}
	private ProductService() {}
	
	private ProductDAO dao = ProductDAO.getInstance();
	
	//상품등록
	public void registerProduct(Product product) {
		dao.insertProduct(product);
	}
	
	//상품목록
	public List<Product> listProduct() {
		return dao.selectProducts();
	}
	
	//상품검색
	public Product serachProduct(String prodName) {
		  return dao.selectProduct(prodName);
    }

}
