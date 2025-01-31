package service;

import java.util.List;

import dao.CustomerDAO;
import entity.Customer;
import entity.Order;

public class CustomerService {

	//싱글톤
	private static final CustomerService instance = new CustomerService();
	public static CustomerService getInstance() {
		return instance;
	}
	private CustomerService() {}
	
	//DAO 객체
	private CustomerDAO dao = CustomerDAO.getInstance();
	
	//회원가입
	public void registerCustomer(Customer customer) {
		dao.insertCustomer(customer);
	}
	
	//로그인
	public Customer loginCustomer(String custId) {
		return dao.selectCustomer(custId);
	}
	
	//회원탈퇴
	public void removeCustomer(String custId) {
		dao.deleteCustomer(custId);
	}
	
	//회원수정
	public void modifyCustomer(Customer customer) {
		dao.updateCustomer(customer);
	}
	
	//회원목록
	public List<Customer> showCustomers() {
		return dao.showCustomers();
	}
}
