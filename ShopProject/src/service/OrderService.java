package service;

import java.util.List;

import dao.OrderDAO;
import entity.Order;

public class OrderService {
	private static final OrderService  instatnce = new OrderService();
	public static OrderService getInstance() {
		return instatnce;
	}
	private OrderService() {}
	
	private OrderDAO dao = OrderDAO.getInstance();
	
	public void makeOrder(Order order) {
		dao.insertOrder(order);
	}
	
	public List<Order> showOrders() {
		return dao.selectOrders();
	}
	
	
	public Order showmyOrder(String orderId) {
		return dao.myOrder(orderId);
	}
}
