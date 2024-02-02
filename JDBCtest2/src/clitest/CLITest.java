package clitest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class CLITest {

	private static Scanner sc = new Scanner(System.in);
	private static final String DB_URL = "jdbc:mysql://localhost:3306/firm";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "mysql";
	private static Connection conn = null;

	public static void main(String[] args) {


		try {
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			Processor processor = new Processor(sc, conn);

			int selectNum;

			while (true) {
				System.out.println("1. 보기 | 2. 등록 | 3. 수정 | 4.삭제 | 5.종료");
				System.out.print("선택> ");

				switch (selectNum = Integer.parseInt(sc.nextLine())) {
				case 1:
					System.out.println("전체 리스트를 봅니다.");
					processor.viewData();
					break;
				case 2:
					System.out.println("신규 데이터를 등록합니다.");
					processor.insertData();
					break;
				case 3:
					System.out.println("데이터를 수정합니다.");
					processor.updateData();
					break;
				case 4:
					System.out.println("삭제");
					processor.deleteData();
					break;
				case 5:
					System.out.println("종료");
					return;	
				default:
					break;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
