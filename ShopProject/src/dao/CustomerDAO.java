package dao;

import java.util.ArrayList;
import java.util.List;
import db.DBHelper;
import db.SQL;
import entity.Customer;

public class CustomerDAO extends DBHelper{
	
	//싱글톤
	private static final CustomerDAO instance = new CustomerDAO();
	public static CustomerDAO getInstance() {
		return instance;
	}
	private CustomerDAO() {}
	
	
	// 기본 CRUD
	public void insertCustomer(Customer customer) {
		try {
			
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.insert_customer);
			psmt.setString(1, customer.getCustId());
			psmt.setString(2, customer.getName());
			psmt.setString(3, customer.getHp());
			psmt.setString(4, customer.getAddr());
			
			psmt.executeUpdate();
			closeAll();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Customer selectCustomer(String custId) {
		
		Customer customer = null;
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.select_customer);
			psmt.setString(1, custId);
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				customer = new Customer();
				customer.setCustId(rs.getString(1));
				customer.setName(rs.getString(2));
				customer.setHp(rs.getString(3));
				customer.setAddr(rs.getString(4));
				customer.setRdate(rs.getString(5));
			}
			closeAll();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return customer;
	}
	
	public List<Customer> showCustomers() {
		
		List<Customer> customers = new ArrayList<Customer>();
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SQL.select_customers);
			
			while(rs.next()) {
				Customer customer = new Customer();
				customer.setCustId(rs.getString(1));
				customer.setName(rs.getString(2));
				customer.setHp(rs.getString(3));
				customer.setAddr(rs.getString(4));
				customer.setRdate(rs.getString(5));
				customers.add(customer);
			}
			closeAll();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return customers;
	}
	
	public void updateCustomer(Customer customer) {
		
	}
	
	public void deleteCustomer(String custId) {
		
	}
	
}
