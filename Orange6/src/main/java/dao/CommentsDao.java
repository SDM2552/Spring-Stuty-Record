package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.Comments;

public class CommentsDao {
//	private static Connection conn;
	private static CommentsDao dao = new CommentsDao();
	private CommentsDao() {}
	PreparedStatement pstmt;
	ResultSet rs;
	public static CommentsDao getInstance() {
//		CommentsDao.getConnection();
		return dao;
	}
	
//	private static void getConnection() {
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			conn = DriverManager.getConnection(
//						"jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
//			} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}
//	}
	
//	public ArrayList<Comments> printComments(Connection conn, int num){ //게시물 댓글 출력
//		ArrayList<Comments> list = new ArrayList<>();
//		String sql = "select COMMENTID, boardid, commentwriter, commenta, commenttime from comments where boardid=? order by commentid desc";
//		try {
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setInt(1, num); 
//			rs = pstmt.executeQuery();
//			
//			while(rs.next()) {
//				Comments comments = new Comments( rs.getInt("COMMENTID"),
//						rs.getInt("boardId"), rs.getString("commentWriter"),
//						rs.getString("commenta"), rs.getString("commentTime"));					
//				list.add(comments);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//		    if (conn != null) {
//		        try {
//		            conn.close();
//		        } catch (SQLException e) {
//		        }
//		    }
//		}
//		return list;		
//	}
	public ArrayList<Comments> printComments(Connection conn, int num) { //댓글 출력
	    ArrayList<Comments> list = new ArrayList<>();
	    String sql = "select COMMENTID, boardid, commentwriter, commenta, commenttime from comments where boardid=? order by commentid desc";
	    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
	        pstmt.setInt(1, num);
	        try (ResultSet rs = pstmt.executeQuery()) {
	            while (rs.next()) {
	                Comments comments = new Comments(rs.getInt("COMMENTID"),
	                        rs.getInt("boardId"), rs.getString("commentWriter"),
	                        rs.getString("commenta"), rs.getString("commentTime"));
	                list.add(comments);
	            }
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
		    if (conn != null) {
		        try {
		            conn.close();
		        } catch (SQLException e) {
		        }
		    }
		}
	    return list;
	}

	
//	public ArrayList<Comments> CountComments(Connection conn){ //게시판 댓글 수
//		ArrayList<Comments> list = new ArrayList<>();
//		String sql = "select boardid, count(*) count from comments GROUP BY boardid order by boardid desc";
//		try {
//			pstmt = conn.prepareStatement(sql);
//			rs=pstmt.executeQuery();
//			while(rs.next()) {
//				Comments comments = new Comments(rs.getInt("count"));
//				list.add(comments);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return list;
//	}
	public ArrayList<Comments> countComments(Connection conn) { //게시물 댓글 수 체크
	    ArrayList<Comments> list = new ArrayList<>();
	    String sql = "SELECT boardid, COUNT(*) AS count FROM comments GROUP BY boardid ORDER BY boardid DESC";
	    try (PreparedStatement pstmt = conn.prepareStatement(sql);
	         ResultSet rs = pstmt.executeQuery()) {
	        
	        while (rs.next()) {
	            int count = rs.getInt("count");
	            Comments comments = new Comments(count);
	            list.add(comments);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return list;
	}
	
	
	
//	public int insert(Connection conn, Comments comments) { //댓글 작성
//		String sql = "insert into comments (commentid, boardid, commentwriter, commenta, commenttime) values (SEQ_COMMENTS.NEXTVAL,?,?,?,SYSDATE)";
//		try {
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setInt(1, comments.getBoardId());
//			pstmt.setString(2, comments.getCommentWriter());
//			pstmt.setString(3, comments.getComment());
//			return pstmt.executeUpdate();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return 0;
//	}
	public int insert(Connection conn, Comments comments) { //댓글 작성
	    String sql = "insert into comments (commentid, boardid, commentwriter, commenta, commenttime) values (SEQ_COMMENTS.NEXTVAL,?,?,?,SYSDATE)";
	    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
	        pstmt.setInt(1, comments.getBoardId());
	        pstmt.setString(2, comments.getCommentWriter());
	        pstmt.setString(3, comments.getComment());
	        return pstmt.executeUpdate();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return 0;
	}

	
	
	public int delete(Connection conn, int num) { //댓글 삭제
		String sql = "delete from comments where commentid = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
