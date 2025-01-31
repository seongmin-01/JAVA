package db;

public class SQL {
	
	//customer
	public static final String insert_customer = "insert into `customer` value(?, ?, ?, ?, now())";
	public static final String select_customer = "select * from `customer` where `custId` = ?";
	public static final String select_customers = "select * from `customer`";
	
	//order
	public static final String insert_order = "insert into `order` set"
			+ "`orderId`=?,"
			+ "`orderProduct`=?,"
			+ "`orderCount`=?,"
			+ "`orderDate`=NOW()";
	
	public static final String select_orders = "select * from `order`";
	
	public static final String select_myorder = "select * from `order` where `custId` = ?";
	
	public static final String select_order = "select "
			
			+ "`orderNo`,"
			+ "`orderId`,"
			+ "`prodName`,"
			+ "`orderCount`,"
			+ "`price`,"
			+ "`orderCount` * `price` as `total`,"
			+ "`orderDate` "
			+ "FROM `Order` as a "
			+ "JOIN `Product` as b ON a.orderProduct = b.prodNo";

	
	public static final String myOrderList = "select "
			+ "`orderId`,"
			+ "`orderCount`,"
			+ "`orderDate`,"
			+ "`name`,"
			+ "`hp`,"
			+ "`addr`"
			+ "from `order` as a "
			+ "join `customer` as b on a.orderId = b.custId where `orderId` = ?";
	
	//product
	public static final String insert_product = "insert into `product` set "
			+ "`prodName`=?,"
			+ "`stock`=?,"
			+ "`price`=?,"
			+ "`company`=?";
	
	public static final String select_products = "select * from `product`";
	
	public static final String seach_product = "select * from `product` where `prodName` = ?";
}
