package collections;

import java.util.List;

import dao.BoardDao;
import dto.Board;

public class ListExample {
	public static void main(String[] args) {
		BoardDao dao = BoardDao.getInstance();
		List<Board> list = dao.selectList();
//		for(Board board : list) {
//			System.out.println(board.getTitle());
//		}
		list.stream().forEach(a->{
			System.out.println(a.getTitle()+", "+a.getWriter());
		});
	}
}
