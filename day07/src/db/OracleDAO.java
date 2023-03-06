package db;

public class OracleDAO implements DAO{ //추상 클래스는 아니지만 비슷한 것???

	@Override
	public void insert(Object obj) {
	System.out.println(obj);
	System.out.println("inserted Oracle Database");
		
	}

	@Override
	public void delete(Object obj) {
		System.out.println(obj);
		System.out.println("Deleted Oracle Database");
	}

	@Override
	public void update(Object obj) {
		System.out.println(obj);
		System.out.println("updated Oracle Database");
		
	}

}
