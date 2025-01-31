package dao;

import java.util.ArrayList;
import java.util.List;

import db.DBHelper;
import db.SQL;
import entity.Order;

public class OrderDAO extends DBHelper{
	private static final OrderDAO instance = new OrderDAO();
	public static OrderDAO getInstance() {
		return instance;
	}
	private OrderDAO() {}
	
	public void insertOrder(Order order) {
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.insert_order);
			psmt.setString(1, order.getOrderId());
			psmt.setInt(2, order.getOrderProduct());
			psmt.setInt(3, order.getOrderCount());
			psmt.executeUpdate();
			closeAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Order selectOrder(int orderNo) {
		return null;
	}
	
	public List<Order> selectOrders() {
		List<Order> orders = new ArrayList<Order>();
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SQL.select_order);
			
			while(rs.next()) {
				Order order = new Order();
				order.setOrderNo(rs.getInt(1));
				order.setOrderId(rs.getString(2));
				order.setProdName(rs.getString(3));
				order.setOrderCount(rs.getInt(4));
				order.setPrice(rs.getInt(5));
				order.setTotal(rs.getInt(6));
				order.setOrderDate(rs.getString(7));
				orders.add(order);
			}
			closeAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return orders;
	}
	
	public Order myOrder(String orderId) {
		Order order = null;
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.myOrderList);
			psmt.setString(1, orderId);
			
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				order = new Order();
				order.setOrderId(rs.getString(1));
				order.setOrderCount(rs.getInt(2));
				order.setOrderDate(rs.getString(3));
				order.setName(rs.getString(4));
				order.setHp(rs.getString(5));
				order.setAddr(rs.getString(6));
			}
			closeAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return order;
	}
	
	public void updateOrder(Order order) {
		
	}
	
	public void deleteOrder(int orderNo) {
		
	}
}
