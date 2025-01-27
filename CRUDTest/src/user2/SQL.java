package user2;

public class SQL {
	//SQL
	public static final String insert_user2 = "insert into `User2` value(?, ?, ?, ?)";
	public static final String select_user2list = "select * from `User2`";
	public static final String select_user2 = "select * from `User2` where `uid`= ?";
	public static final String update_user2 = "update `User2` set `name`=?, `birth` =?, `addr`= ? where `uid`= ?";
	public static final String delete_user2 = "delete from `User2` where `uid`=?";
}
