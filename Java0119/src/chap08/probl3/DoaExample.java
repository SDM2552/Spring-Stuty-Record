package chap08.probl3;

public class DoaExample {

	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {

		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}

}
