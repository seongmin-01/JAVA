package dao;

import java.util.ArrayList;
import java.util.List;

import db.DBHelper;
import db.SQL;
import entity.Product;

public class ProductDAO extends DBHelper{
	
	private static final ProductDAO instance = new ProductDAO();
	public static ProductDAO getInstance() {
		return instance;
	}
	private ProductDAO() {}
	
	public void insertProduct(Product product) {
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.insert_product);
			psmt.setString(1, product.getProdName());
			psmt.setInt(2, product.getStock());
			psmt.setInt(3, product.getPrice());
			psmt.setString(4, product.getCompany());
			
			psmt.executeUpdate();
			closeAll();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Product> selectProducts() {
		
		List<Product> products = new ArrayList<Product>();
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SQL.select_products);
			
			while(rs.next()) {
				Product product = new Product();
				product.setProdNo(rs.getInt(1));
				product.setProdName(rs.getString(2));
				product.setStock(rs.getInt(3));
				product.setPrice(rs.getInt(4));
				product.setCompany(rs.getString(5));
				products.add(product);
			}
			closeAll();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return products;
	}
	
	public Product selectProduct(String prodName) {
		Product product = null;
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.seach_product);
			psmt.setString(1, prodName);
			
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				product = new Product();
				product.setProdNo(rs.getInt(1));
				product.setProdName(rs.getString(2));
				product.setStock(rs.getInt(3));
				product.setPrice(rs.getInt(4));
				product.setCompany(rs.getString(5));
			}
			closeAll();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return product;
	}
	
}
