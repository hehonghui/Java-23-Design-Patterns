package BridgePattern;

public class MysqlDriver implements DBDriver {

	@Override
	public void driver() {
		System.out.println("mysql驱动数据库");
	}

}
