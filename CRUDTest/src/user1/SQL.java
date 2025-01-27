package user1;

public class SQL {

	//SQL
	public static final String insert_user1 = "insert into `User1` value(?, ?, ?, ?)";
	public static final String select_user1list = "select * from `User1`";
	public static final String select_user1 = "select * from `User1` where `uid`= ?";
	public static final String update_user1 = "update `User1` set `name`=?, `hp` =?, `age`= ? where `uid`= ?";
	public static final String delete_user1 = "delete from `User1` where `uid`=?";
}
