package designPattern;


public class AbstractFactory{
	
	/**
	 *todo this is todo
	 *
	 * */

	/**
	 * this is not todo
	 * 程序需要处理不同系列的相关产品，但是不希望它依赖这些产品的具体类，可以使用抽象工厂
	 *
	 * 可以确信从工厂得到的产品彼此是兼容的
	 * 可以避免具体产品和客户端代码之间紧密耦合
	 * 符合单一职责原则
	 * 符合开闭原则,不需要修改代码，只是实现相关代码即可
	 * jdk 接口 Connection接口
	 * */
	public static void main(String[] args) {
		IDatabaseUtils iDatabaseUtils = new MySQLBaseUtils();
		IConnection connection = iDatabaseUtils.getConnection();
		connection.connect();
		ICommand command = iDatabaseUtils.getCommand();
		command.command();
	}


}


interface IConnection{
	void connect();
}

class MySQLConnection implements IConnection{

	@Override
	public void connect() {
		System.out.println("mysql connected.");	
	}

}


interface ICommand{
	void command();
}

class MySQLCommand implements ICommand{

	@Override
	public void command() {
		System.out.println("mysql command.");
	}
	

}

interface IDatabaseUtils{
	IConnection getConnection();
	ICommand getCommand();

}

class MySQLBaseUtils implements IDatabaseUtils{

	@Override
	public IConnection getConnection() {
		return new MySQLConnection();
	}

	@Override
	public ICommand getCommand() {
		return new MySQLCommand();
	}


}
